import java.util.Arrays;

public class arraytest {

	public static void main(String[] arg){
		int[][] a = {{1,2},{3,4}};
//		int[][] b = {{1,2},{3,4}};
		int[][] b = new int[2][2];
		int i = 0;
		boolean t = true;
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
