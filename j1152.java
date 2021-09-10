import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j1152 {
	public static void main(String [] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String a = bf.readLine();
		String[] A = a.split("\\s");
		
		if (a.equals("") || a.equals(" ")){ // ÀÔ·Â°ª
			System.out.println(0);
		}else if (A[0].equals("") && A[A.length-1].equals("")) {
			System.out.println(A.length-2);
		}else if(A[0].equals("") || A[A.length-1].equals("")){
			System.out.println(A.length-1);
		}else{
			System.out.println(A.length);
		}
		
	}
}