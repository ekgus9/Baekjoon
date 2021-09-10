import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j5622{
	public static void main(String [] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		
		int result = 2 * a.length();
		
		for (int i=0; i<a.length(); i++) {
			for (int t=5; t>=0; t--) {
				if ((a.charAt(i) - 'W') >= 0) {
					result += 8;
					break;
				} else if((a.charAt(i) - 'T') >= 0) {
					result += 7;
					break;
				}else if((a.charAt(i) - 'S') == 0) {
					result += 6;
					break;
				}else if ((a.charAt(i) -'A') >=(3 * t)) {
					result += 1;
				}
			}
			
		}
		System.out.println(result);
	}
}