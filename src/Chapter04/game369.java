package Chapter04;

public class game369 {
	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			int count = 0;
			if(i % 10 != 0 && i % 10 % 3 == 0) {
				count++;
			}
			if(i / 10 != 0 && i / 10 % 3 == 0) {
				count++;
			}
			if(count > 0) {
				if(count > 1) System.out.println(i + " 박수 두번");
				else System.out.println(i + " 박수 한번");
			}
		}
	}
}
