package day0705;

public class LottoGame01 {
	public static void main(String[] args) {
		
		int[] a = new int[6];
		int r = (int)(Math.random() * 45 + 1);
		
		for(int i = 0; i<a.length; i++) {
			int j;
			r = (int)(Math.random() * 45 + 1);
			for(j = 0; j<i; j++) {
				if(r == a[j]) {
					break;
				}
			}
			if(i==j) {
				a[i] = r;
			} else {
				--i;
			}
			System.out.print(a[i] + " ");
		}
	}
}
