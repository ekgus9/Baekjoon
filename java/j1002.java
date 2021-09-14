import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1002{
	public static boolean[] b;
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			double rl = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2); // 오차 최소화
			double rt  = (r1+r2)*(r1+r2);
			double rc = (r1-r2)*(r1-r2);
			
			if (rl == 0 && r1 == r2) sb.append(-1).append("\n");
			else if (rl == 0) sb.append(0).append("\n");
			else if (rt == rl) sb.append(1).append("\n");
			else if (rc == rl) sb.append(1).append("\n");
			else if (rt > rl && rl > rc) sb.append(2).append("\n");
			else sb.append(0).append("\n");
		}
		System.out.println(sb);
	}
}