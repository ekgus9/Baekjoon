import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j14888 {
	public static int ns[];
	public static int opelst[];
	public static int ope[];
	public static int count[];
	public static int N;
	public static int save[];
	public static int co;
	public static int max;
	public static int min;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		
		StringTokenizer st1 = new StringTokenizer(bf.readLine()," ");
		ns = new int[N];
		for(int i=0;i<N;i++) {
			ns[i] = Integer.parseInt(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(bf.readLine()," ");
		ope = new int[N-1];
		int c = 0;
		for (int i = 0;i<4;i++) {
			int p = Integer.parseInt(st2.nextToken());
			for(int j=0;j<p;j++) {
				ope[c++] = i;
			}
		}

		opelst = new int[N];
		save = new int[N];
		count = new int[N];
		for(int i=0;i<N-1;i++) {
			opelst[0]=ope[i];
			count[0]=i;
			q(1);
		}
		System.out.println(max);
		System.out.println(min);
	}
	public static void q(int a) {
		if (a==N-1) {
			save[0]=ns[0];
			for(int i=0;i<N-1;i++) {
				if(opelst[i]==0) {
					save[i+1] = save[i]+ns[i+1];
				}else if(opelst[i]==1) {
					save[i+1] = save[i]-ns[i+1];
				}else if(opelst[i]==2) {
					save[i+1] = save[i]*ns[i+1];
				}else if(opelst[i]==3) {
					if (save[i]<0) {
						save[i+1] = -((-save[i])/ns[i+1]);	
					}else {
						save[i+1] = save[i]/ns[i+1];
					}
				}
			}
			if (co==0) {
				max = save[N-1];
				min = save[N-1];
				co++;
			}else {
				if(max<save[N-1]) max = save[N-1];
				if (min>save[N-1]) min = save[N-1];
			}
			return;
		}
		for (int i=0;i<N-1;i++) {
			opelst[a] = ope[i];
			count[a] = i;
			if (ispossible(a)) {
				q(a+1);
			}
		}
	}
	public static boolean ispossible(int a) {
		for (int i=0;i<a;i++) {
			if (count[a]==count[i]) return false;
		}
		return true;
	}
}
