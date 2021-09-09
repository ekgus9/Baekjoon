// indexOf
// 검토 후 주석 달고 올리기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class j10809 {
	public static void main(String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String s = br.readLine();
		
		int[] n = new int[26];
		Arrays.fill(n, -1); // 배열 채우기
		
		for (int i = 0 ; i < s.length();i++) { 
			char ch = s.charAt(i);
			
			if (n[ch-'a'] == -1){ // 아스키코드 a=97
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
