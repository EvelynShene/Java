import java.util.Arrays;

public class arrayEqualTest {

	public static void main(String[] arg){
		int[][] a = {{1,2},{3,4}};
//		int[][] b = {{1,2},{3,4}};
		int[][] b = new int[2][2];
		int i = 0;
		boolean t = true;
		
		/* Array的相等（equals）判断只能是一维的 */
		if(a != null && b != null && a.length == b.length){
			for(int l = 0; l < a.length; l++){
				if(!Arrays.equals(a[l], b[l])){
					t = false;
					break;
				}
			}
		}
		else{
			t = false;
		}
		while(true){
			i++;
		}
		
//		System.out.println(t);
	}
}
