import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class j2751{
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int[] n = new int[N];
		
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(bf.readLine());
			n[i] = a;
		}
		
		Arrays.sort(n);
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			sb.append(n[i]);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}