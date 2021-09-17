import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j2798{
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(bf.readLine()," ");
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(bf.readLine()," ");
		
		int card[] = new int[N];
		for (int i = 0; i<N; i++) {
			card[i] = Integer.parseInt(st2.nextToken());	
		}
		
		int max = 0;
		for(int i = 0;i<N-2;i++) {
			for (int ii = i+1; ii<N-1;ii++) {
				for (int iii=ii+1;iii<N;iii++) {
					
					if(card[i]+card[ii]+card[iii]<=M) {
						if (max<card[i]+card[ii]+card[iii]) {
							max = card[i]+card[ii]+card[iii];
						}
					}
					
				}
			}
		}
		System.out.println(max);
	}
}