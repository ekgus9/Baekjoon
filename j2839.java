import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j2839{
	public static void main(String [] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i <= a/5 ; i++) {
			if ((a-(a/5-i)*5) % 3 == 0) {
				System.out.println(a/5-i + (a-(a/5-i)*5) / 3);
				break;
			} else if(i == a/5) {	
				System.out.println(-1);
			}
		}
	}
}