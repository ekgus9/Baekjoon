import java.util.Scanner;

public class j2588 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int A =s.nextInt();
		int B =s.nextInt();
		
		int A3 = A/100;
		int A2 = (A - (A3*100)) /10;
		int A1 = (A - A2*10 -A3*100);
		
		int B3 = B/100;
		int B2 = (B - (B3*100)) /10;
		int B1 = (B - B2*10 -B3*100);
		
		System.out.println(A3*B1*100+A2*B1*10+A1*B1);
		System.out.println(A3*B2*100+A2*B2*10+A1*B2);
		System.out.println(A3*B3*100+A2*B3*10+A1*B3);
		System.out.println(A*B);
		
		s.close();
		
	}

}