import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j1003 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i=0; i<N;i++) {
			int n = Integer.parseInt(bf.readLine());
			result0 = new int[n+2];
			result1 = new int[n+2];
			fibonacci(n);
			System.out.println(result0[n]+" "+result1[n]);
		}
	}
	public static int result0[];
	public static int result1[];
	public static void fibonacci(int n) {
		result0[0] = 1;
		result1[0] = 0;
		
		result0[1] = 0;
		result1[1] = 1;
		for (int i=2;i<=n;i++) {
			result0[i] = result0[i-1]+result0[i-2];
			result1[i] = result1[i-1]+result1[i-2];
		}
	}
}
