import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j9184 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int aa[][][] = new int[21][21][21];
		aa[0][0][0]=1;
		
		for(int i=0;i<=20;i++) {
			for(int d=0;d<=20;d++) {
				for(int k=0;k<=20;k++) {
					if (i<=0||d==0||k==0) aa[i][d][k] = 1;
					else if (i<d && d<k) {
						aa[i][d][k] = aa[i][d][k-1]+aa[i][d-1][k-1]-aa[i][d-1][k];
					}else {
						aa[i][d][k] = aa[i-1][d][k]+aa[i-1][d-1][k]+aa[i-1][d][k-1]-aa[i-1][d-1][k-1];
					}
				}
			}
		}
		
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a==-1&&b==-1&&c==-1) break;
			
			if (a<=0||b<=0||c<=0) {
				System.out.println("w("+a+", "+b+", "+c+") = "+1);
			}else if (a>20||b>20||c>20) {
				System.out.println("w("+a+", "+b+", "+c+") = "+aa[20][20][20]);
			}else {
				System.out.println("w("+a+", "+b+", "+c+") = "+aa[a][b][c]);
			}
		}	
	}
	
}
