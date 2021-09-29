import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j11650{
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); 
		int[][] n = new int[N][2];
		
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			n[i][0] = a;
			n[i][1] = b;
		}
		save = new int[N][2];
		merge(n,0,N-1);
		for(int i=0;i<N;i++) {
			System.out.println(n[i][0]+" "+n[i][1]);
		}
	}
	public static int[][] save;
	public static void merge(int[][] n, int start, int end) {
		if(start>=end) return;
		
		int mid = (end+start) / 2;
		merge(n,start,mid);
		merge(n,mid + 1,end);
		
		int s = start;
		int m = mid+1;
		int idx = s;
		
		while(s<=mid || m<=end) {
			if(s>mid || (m<=end&&n[s][0]>n[m][0])||(m<=end&&n[s][0]==n[m][0]&&n[s][1]>n[m][1])) {
				save[idx][1] = n[m][1];
				save[idx++][0] = n[m++][0];
			}else {
				save[idx][1] = n[s][1];
				save[idx++][0] = n[s++][0];
			}
		}
		
		for(int i = start; i<=end;i++) {
			n[i][0] = save[i][0];
			n[i][1] = save[i][1];
		}
	}
}