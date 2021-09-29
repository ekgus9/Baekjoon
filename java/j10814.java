import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// merge array
public class j10814{
	public static int[] save;
	public static int[] n;
	public static String[] name;
	public static String[] save_n;
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); 
		n= new int[N]; // 전역변수일땐 int 붙이면 안됨
		name = new String[N];
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			
			n[i] = a;
			name[i] = b;
		}
		save= new int[N];
		save_n= new String[N];
		array(0,N-1);
		for(int i=0;i<N;i++) {
			System.out.println(n[i]+" "+name[i]);
		}
	}
	public static void array(int start,int end) {
		if(start>=end) return;
		
		int mid = (start+end)/2;
		array(start,mid);
		array(mid + 1,end);
		
		int s = start;
		int m = mid+1;
		int idx = s;
		
		while (s<=mid || m<=end) {
			if(s>mid || (m<=end && n[s]>n[m])) {
				save_n[idx]=name[m];
				save[idx++]=n[m++];
			}else {
				save_n[idx]=name[s];
				save[idx++]=n[s++];
			}
		}
		for(int i=start;i<=end;i++) {
			n[i]=save[i];
			name[i]=save_n[i];
		}
	}
}