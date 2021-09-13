import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j4948{
	public static boolean[] b;
	public static void main(String [] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(bf.readLine());
			if (n == 0) break;

			b = new boolean[n*2 + 1];
			s();
			
			int result = 0;
			
			for(int i=n+1;i<=n*2;i++) { // not 2n
				if(!b[i]) result++;
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
	public static void s() {
		b[0] = b[1] = true;
		
		for (int i = 2; i <= Math.sqrt(b.length);i++) {
			if(b[i]) continue;
			
			for (int ii = i*i; ii< b.length;ii+=i) {
				b[ii] = true;
			}
		}
	}
}
