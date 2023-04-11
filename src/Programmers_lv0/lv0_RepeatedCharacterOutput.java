package Programmers_lv0;

public class lv0_RepeatedCharacterOutput {
	public static void main(String[] args) {
		String my_string = "Hi World!";
		System.out.println(solution(my_string, 3));
	}
	
	public static String solution(String my_string, int n) {
        char[] arr = my_string.toCharArray();
        char[] mul_arr = new char[arr.length * n];
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < n; j++) {
        		mul_arr[count++] = arr[i];
        	}
        }
        
        String answer = String.valueOf(mul_arr);
        return answer;
    }
}
