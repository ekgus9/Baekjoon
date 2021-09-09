import java.util.Scanner;

public class j2675{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in); // BufferedReader는 \n로 입력값 구분
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			String S = sc.next();
			
			String[] s = S.split("");
			
			for (int ii = 0 ; ii < S.length(); ii++) {
				
				for (int iii = 0; iii< N ; iii++) {
					sb.append(s[ii]);
				}
				
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}