import java.util.Scanner;

public class j2908 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		String A[] = s.next().split("");
		String B[] = s.next().split("");
		
		String a_ = A[2]+A[1]+A[0];
		String b_ = B[2]+B[1]+B[0];
		
		System.out.println(Math.max(Integer.parseInt(a_),Integer.parseInt(b_)));
	}
}
