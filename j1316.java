import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j1316{
	public static void main(String [] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine());
		int result = 0;
		
		for (int i=1 ; i <= a; i++) {
			String s = bf.readLine();
			boolean b = true;
			
			for (int ii = 0 ; ii < s.length()-1 ; ii++) {
				for (int iii = ii+1 ; iii < s.length() ; iii++) {
					if (s.charAt(ii) == s.charAt(iii)) {
						if (s.charAt(ii) != s.charAt(ii+1)) {
							b = false;
						}
					} 
				}
			}
			if (b == true) {
				result += 1;
			}
		}
		System.out.println(result);
	}
}