package Programmers_lv1;

public class lv1_HidingCellphoneNumber {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}
	
	public static String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        for(int i = 0; i < arr.length - 4; i ++){
            arr[i] = '*';
        }
        return String.valueOf(arr);
    }
}
