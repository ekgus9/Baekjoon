import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class j1157{
	public static void main(String [] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String A = bf.readLine().toUpperCase();
		
		int A_ap[] = new int[26];
		
		for (int i = 0; i < A.length(); i++ ) {
			
			A_ap[(A.charAt(i) - 'A')] += 1;	
		}
		
		int n=0; // max인 알파벳의 개수
		int n_max = Arrays.stream(A_ap).max().getAsInt();
		
		for (int i = 0; i < 26;i++ ) {
			if (A_ap[i] == n_max) {
				n += 1;
			}
		}
		
		if (n < 2) {
			for (int i = 0; i < 26; i++ ) {
				if (A_ap[i] == n_max) {
					System.out.println((char) ('A' + i));
					break;
				}
			}
		}else {
			System.out.println("?");
		}
	}
}