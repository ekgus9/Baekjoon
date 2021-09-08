import java.util.Scanner;

public class j11720 {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int s1 = s.nextInt();
		String s2 = s.next(); // int ¹üÀ§ -2,147,483,648 ~ 2,147,483,647
		
		String[] s_spl = s2.split("");
		
		int result = 0;
		
		for (int i = 0; i < s1; i++) {
			result = result + Integer.parseInt(s_spl[i]); // result += num.charAt(s2) - '0';
		}
		
		System.out.println(result);
	}
	
}