import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10989{
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int[] n = new int[10001];
		
		for(int i = 0; i <N;i++) {
			int a = Integer.parseInt(bf.readLine());
			n[a] += 1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <=10000;i++) {
			if(n[i]>0) {
				for(int j=0;j<n[i];j++) {
					sb.append(i);
					sb.append('\n');
				}
			}
		}
		
		System.out.println(sb);
	}
}