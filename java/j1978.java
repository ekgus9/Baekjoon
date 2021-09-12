import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1978{
	public static void main(String [] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer t = new StringTokenizer(bf.readLine()," ");
		
		int sn = 0;
		
		for(int i = 0 ; i < a ; i++) {
			int T = Integer.parseInt(t.nextToken());
			if (T == 2) {
				sn++;
			}
			for(int ii = 2; ii < T; ii++) {
				if (T != ii && T % ii == 0) {
					break;
				} else if(ii == T-1) {
					sn++;
				}
			}
		}
		System.out.println(sn);
	}
}