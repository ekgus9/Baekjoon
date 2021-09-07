import java.util.Scanner;

public class j10871 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int X = s.nextInt();
		StringBuffer a = new StringBuffer();
		
		if (N >= 1 && X <= 10000) {
			
			for (int i = 1; i <= N; i++) {
				
				int A = s.nextInt();
				
				if (A < X) {
					a.append(A);
					if (i == N) {break;}
					a.append(" ");
				}
				
			}
			
		}
		
		System.out.println(a);
		s.close();
	}
}