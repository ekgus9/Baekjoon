import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j2869{
	public static void main(String [] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String b = bf.readLine();
		String[] s = b.split(" ");
		double A = Integer.parseInt(s[0]);
		double B = Integer.parseInt(s[1]);
		double V = Integer.parseInt(s[2]);
		
		System.out.println((int)Math.ceil((V-A)/(A-B) + 1));	
				
	}
}
