package Programmers_lv1;

public class lv1_NumberOfPY {
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
	
	public static boolean solution(String s) {
        int cp = 0, cy = 0;
        
        s = s.toUpperCase();
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == 80) cp++;
        	else if(arr[i] == 89) cy++;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return cp == cy;
    }
}
