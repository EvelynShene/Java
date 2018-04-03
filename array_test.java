import java.util.ArrayList;

public class test {
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		
		int[][] b = new int[2][2];
		
		
//		b = change3(a);
		
		copyarray(a,b);
		b[0][0] = 5;
		
		System.out.println("a:");
		print(a);
		System.out.println("b:");
		print(b);
		
		
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
	}
	
	private static int[][] change3(int[][] a) {
		// TODO Auto-generated method stub
		int[][] t = new int[2][2];
//		t = (int[][]) a.clone();
		copyarray(a,t);
		t[0][0] = 9;
		System.out.println("a[0]:"+a[0][0]);
 		return t;
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
//		for(int i=0;i<3;i++){
//			t[i] = t[i] + 3;
//		}
//		c.add(t);
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

	//此函数中参数a是传值参数
	public static int[][] change(int[][] a){ 
		int[][] t = new int[2][2];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				t[i][j] = a[i][j] + i;
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
