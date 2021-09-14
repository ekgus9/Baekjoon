import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j9020{
	public static boolean[] b;
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			int g = Integer.parseInt(bf.readLine());
			
			b = new boolean[g+1];
			s();
			String result = "";
			
			for (int j = 2; j<=g/2; j++) {
				if (!b[j]) {
					if (!b[g - j]) {
						result = j+" "+(g-j);
					}
				}
			}	
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
	public static void s() {
		b[0] = b[1] = true;
		
		for (int i=2; i<=Math.sqrt(b.length); i++) {
			if (b[i]) continue;
			
			for (int ii=i*i; ii<b.length; ii+=i) {
				b[ii] = true;
			}
		}
	}
}