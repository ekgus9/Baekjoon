public class j4673 {
	
	public static void main(String[] args) {
		
		boolean[] b = new boolean[10001]; // �ʱⰪ false
		
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

// �� �ڸ� �� ���ϱ�
	public static int d (int n) {
		
		int dn = n; // ���� �ʱ�ȭ
		
		while (n != 0){ 
			dn = dn + n % 10; // ������(���� �ڸ� ��)
			n = n / 10;
		}
	
		return dn;
	}
}
