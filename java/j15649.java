import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j15649 {
	public static int b[];
	public static StringBuilder sb;
	public static int a;
	public static int N;
	public static int M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		b = new int[M+1];
		sb = new StringBuilder();
		for (int i=1;i<=N;i++) {
			a = i;
			b[1]=a;
			make(2);
		}
		System.out.println(sb);
	}
	public static void make(int n) {
		if (n>M) {
			for (int i=1;i<=M;i++) {
				sb.append(b[i]);
				sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int j=1;j<=N;j++) {
			b[n]=j;
			if(ispossible(n)) {
				make(n+1);	
			}
		}
	}
	public static boolean ispossible(int n) {
		for (int i=1;i<n;i++) {
			if(b[i] == b[n]) {
				return false;
			}
		}
		return true;
	}
}