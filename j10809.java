// indexOf
// ���� �� �ּ� �ް� �ø���

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class j10809 {
	public static void main(String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String s = br.readLine();
		
		int[] n = new int[26];
		Arrays.fill(n, -1); // �迭 ä���
		
		for (int i = 0 ; i < s.length();i++) { 
			char ch = s.charAt(i);
			
			if (n[ch-'a'] == -1){ // �ƽ�Ű�ڵ� a=97
				n[ch-'a'] = i;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < 26 ; i++) {
			sb.append(n[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}