import java.util.ArrayList;

public class Array {
	/** Arrays.copyOf() 进行扩容数组：Array.copy(E[] e,newLength)
	 *   实现：在内部重新创建一个长度为 newLength 类型是 E 的数组。
	*/
	int[] a= {10,20,30,40,50};
        a= Arrays.copyOf(a,a.length+1);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
	    // 默认补 0，输出结果为： 10 20 30 40 50 0
        }
	
	/** 
	 * copyarray: 二维数组对象复制 （深复制）
	 * clone()和“=”都是复制引用 （浅复制）
	*/
	public static void copyarray(int[][] src, int[][] dest){ 
		for(int i = 0; i < src.length; i++){
			System.arraycopy(src[i], 0, dest[i], 0, src[i].length);
		}
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		
		int[][] b = new int[2][2];
				
		copyarray(a,b);
		b[0][0] = 5;
		
		System.out.println("a:");
		print(a); 
		/* a:
		 * 1 2
		 * 3 4
		 * */
		System.out.println("b:");
		print(b);
		/* b:
		 * 5 2
		 * 3 4
		 * */
		
		/**
		 * 二维数组outerArr, 每一维都是一个String数组，length=4；
		 * String数组是用函数add()动态添加到outerArr中的
		 */
		ArrayList<String[]> outerArr = new ArrayList<String[]>(); 
		String[] myString1= {"hey","hey","hey","hey"};  
		outerArr .add(myString1);
		String[] myString2= {"you","you","you","you"};
		outerArr .add(myString2);
		
		for(int i=0;i<outerArr.size();i++){
			String[] myString= new String[4]; 
			myString=outerArr.get(i);
			for(int j=0;j<myString.length;j++){
			   System.out.print(myString[j]); 
			}
			System.out.println();
		}
		
		
		ArrayList<int[]> c = new ArrayList<int[]>();
		boolean y = false;
		change2(c,y); 
		// y传值参数
		System.out.println(y);
		int[] t = {4,5,6};
		c.add(t);
		System.out.println();
		for(int i=0;i<c.size();i++){
			int[] x = c.get(i);
			for(int j=0;j<x.length;j++){
				System.out.print(x[j]);
			}
			System.out.println();
		}
		
		print(a);
		/* a:
		 * 1 2
		 * 3 4
		 * */
		b = change(a);
		print(a);
		/* a:
		 * 2 3
		 * 4 5
		 * */
		print(b);
		/* b:
		 * 1 2
		 * 4 5
		 * */
	}
	
	private static void change2(ArrayList<int[]> c, boolean y) {
		// TODO Auto-generated method stub
		int[] t = {1,2,3};
		c.add(t);
		for(int i=0;i<c.size();i++){
			int[] x = c.get(i);
			for(int j=0;j<x.length;j++){
				System.out.print(x[j]);
			}
			System.out.println();
		}
		y = true;
		System.out.println(y);
	}

	//此函数中参数a是传引用
	public static int[][] change(int[][] a){ 
		int[][] t = new int[2][2];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				t[i][j] = a[i][j] + i;
				a[i][j] ++;
			}
		}
		return t;
		
	}
	
	public static void print(int[][] x){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
