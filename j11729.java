import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j11729 {
 public static StringBuilder s = new StringBuilder(); // 시간 단축
 public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
	 int K = Integer.parseInt(sb.readLine());
	 System.out.println((int) Math.pow(2, K)-1); // 2^K -1
	 ht(K, 1,2,3);
	 System.out.println(s);
 }

 public static void ht(int k, int n1 , int n2, int n3) {
	if (k == 0) {
		 return;
	}
	ht(k-1,n1,n3,n2);
	s.append(n1 + " " + n3 + "\n");
	ht(k-1,n2,n1,n3);
 }
}