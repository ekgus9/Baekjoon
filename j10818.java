import java.util.Arrays;
import java.util.Scanner;

public class j10818 {
	public static void main(String[] args) {
		
		// scanner에 "//s"(공백)을 쓰면 next로 넘어감
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int[] Ns = new int[N];
		
		for (int i = 1; i <= N ; i++) {
			int N_int = s.nextInt();
			Ns[i-1] = N_int;
		}
		
		int n_max = Arrays.stream(Ns).max().getAsInt();
		int n_min = Arrays.stream(Ns).min().getAsInt();
		
		System.out.println(n_min+" "+n_max);
		s.close();
	}
}