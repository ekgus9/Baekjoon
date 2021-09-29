import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j1427{
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String N = bf.readLine();
		String[] s = N.split("");
		int[] n = new int[10];
		
		for(int i = 0;i<N.length();i++) {
			n[Integer.parseInt(s[i])] += 1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=9;i>=0;i--) {
			if (n[i]>0) {
				for(int j=0;j<n[i];j++) {
					sb.append(i);
				}
			}
		}
		System.out.println(sb);
	}
}
