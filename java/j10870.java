import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10870{
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		System.out.println(p(N));
	}
	public static int p(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else {
			return p(n-1)+p(n-2);
		}
	}
}