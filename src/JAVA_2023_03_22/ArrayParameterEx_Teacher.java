package JAVA_2023_03_22;

public class ArrayParameterEx_Teacher {
	public static void main(String[] args) {
		String[] str = {"to", " ", "be", " ", "or", " ", "not", " ", "to", " ", "be"};
		printStringArray(str);
		replaceBe(str);
		printStringArray(str);
	}
	
	public static void printStringArray(String[] str) {
		StringBuilder sb = new StringBuilder();
		for(String s : str) sb.append(s);
		System.out.println(sb.toString());
	}
	
	public static void replaceBe(String[] str) {
		for(int i = 0; i < str.length; i++) {
			str[i] = str[i].replace("be", "eat");
		}
	}
}
