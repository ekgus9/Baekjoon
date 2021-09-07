public class j4673 {
	
	public static void main(String[] args) {
		
		boolean[] b = new boolean[10001]; // 초기값 false
		
		for(int i = 1 ;i <= 10000; i++) {
			
			if(d(i)<=10000) {
				b[d(i)] = true;
			}
			
		}
		
		StringBuilder prin = new StringBuilder();
		
		for (int i = 1; i <= 10000; i++) {
			if(!b[i]) {
				prin.append(i).append("\n");
			}
		}
		
		System.out.println(prin);
	}

// 각 자리 수 더하기
	public static int d (int n) {
		
		int dn = n; // 변수 초기화
		
		while (n != 0){ 
			dn = dn + n % 10; // 나머지(일의 자리 수)
			n = n / 10;
		}
	
		return dn;
	}
}
