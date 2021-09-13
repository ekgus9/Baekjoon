import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1929{ // 에라토스테네스의 체
	public static boolean[] b;
	public static void main(String [] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(bf.readLine()," ");
		int a = Integer.parseInt(t.nextToken());
		int z = Integer.parseInt(t.nextToken());
		
		b = new boolean[z+1];
		ss();
		
		for(int i = a ; i <= z ; i++) {
			if (!b[i]) System.out.println(i);
		}
	}
	public static void ss() {
		b[0] = true;
		b[1] = true;
		
		for (int i = 2 ; i <= Math.sqrt(b.length) ; i++) { // 제곱급
			if (b[i]) continue;
			
			for (int j = i*i; j < b.length ; j=j+i) {
				b[j] = true;
			}
		}
	}
}