package newPackage;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
//		+ 할때 문자열이 하나라도 있으면 전체는 문자열이 됨
		System.out.println(hour + "시간 " + minute + "분");
		System.out.println(hour * 60 + minute + "분");
		
	}
}
