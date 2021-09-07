import java.util.Scanner;

public class j1110 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int n = N;
		int sl = 0;
		
		while (true) {
			
			if (N >= 10) {
				int N1 = N - ((N / 10)*10);
				N = (N / 10) + N1;
				N = (N - ((N / 10)*10)) + (N1*10);
			} else if (N < 10) {
				N = N + (N*10);
			}

			sl++;
			if(N == n) {break;}	
		}
			
		System.out.println(sl);
		s.close();
	}
}
