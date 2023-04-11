package Programmers_lv1;

public class lv1_NumberStringAndEngWord {
	public static void main(String[] args) {
		String s = "2three45sixseven";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        String[] Numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])) {
				sb1.append(arr[i]);
			}
			else {
				sb2.append(arr[i]);
				for(int j = 0; j < 10; j++) {
					if(Numbers[j].equals(sb2.toString())) {
						sb2.setLength(0);
						sb1.append(j);
					}
				}
			}
		}
        answer = Integer.parseInt(sb1.toString());
        
        return answer;
//		String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
//        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//
//        for(int i=0; i<10; i++){
//            s = s.replaceAll(alphabets[i],digits[i]);
//        }
//
//        return Integer.parseInt(s);
    }
}
