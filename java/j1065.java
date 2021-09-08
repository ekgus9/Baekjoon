
import java.util.Scanner;

public class j1065 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int hn = 0;

		for (int i=1; i <=N; i++ ) {
			if (h(i) == 0) {
				hn = hn + 1;
			}
		}
		System.out.println(hn);
		
		
	}
	
	public static int h(int N) {
		
		int n = 0;
		int i = 0;
		int[] n1 = new int[1001];
		
		while (N != 0) {
			
			n = N % 10;
			n1[i] = n;
			
			if (i >=2) {
				if ((n1[i]-n1[i-1]) != (n1[i-1]-n1[i-2])) {
					return 1; 
				}
			}
			N = N /10; 
			i++;
		}
		return 0;
	}
}
