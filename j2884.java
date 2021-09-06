import java.util.Scanner;

public class j2884 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();
		
		if (M < 45 && M >= 0 && H >= 0 && H <= 23) {
			
			if (H == 0) {
				H = 23;
			}else {
				H = H - 1;
			}
			
			M = 60 - (45 - M);
			
		}else if(M >= 45 && M < 60 && H >= 0 && H <= 23){
			
			M = M - 45;	
		
		}
		
		System.out.println(H+" "+M);
		s.close();
		
	}
}