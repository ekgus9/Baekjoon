import java.util.Scanner;

public class j3052 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int[] na = new int[10];
		
		for (int i = 0 ; i < 10; i++) {
			na[i] = s.nextInt() % 42;
		}
		
		int result = 0;
		
		for (int i1 = 0 ; i1 < 10; i1++) {
			for (int i2 = i1 + 1 ; i2 < 10; i2++) {
				if (na[i1] == na[i2]) {
					result = result + 1;
					break;
				}
			}
		}
		
		System.out.println(10 - result);
		s.close();
	}
}
