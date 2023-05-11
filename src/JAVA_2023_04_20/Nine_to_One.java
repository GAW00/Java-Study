package JAVA_2023_04_20;

public class Nine_to_One {
	public static void main(String[] args) {
		for(int i = 9; i > 0; i--){
			for(int j = i; j > 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
