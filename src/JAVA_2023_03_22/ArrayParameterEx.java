package JAVA_2023_03_22;

public class ArrayParameterEx {
	public static void main(String[] args) {
		String[] str = {"to", " ", "be", " ", "or", " ", "not", " ", "to", " ", "be"};
		printStringArray(str);
		replaceBe(str);
		printStringArray(str);
	}
	
	public static void printStringArray(String[] str) {
		for(String s : str) System.out.print(s);
		System.out.println();
	}
	
	public static void replaceBe(String[] str) {
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("be")) str[i] = "eat";
		}
	}
}
