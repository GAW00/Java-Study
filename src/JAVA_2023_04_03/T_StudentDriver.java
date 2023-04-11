package JAVA_2023_04_03;

public class T_StudentDriver {
	public static void main(String[] args) {
		T_Student student1, student2;
		
		student1 = new T_Student();
		student1.setName("갑돌");
		student1.setNumber(100);
		student1.setDepartment("컴퓨터공학과");
		System.out.println(student1);
		
		System.out.println("-----------------");
		
		student2 = new T_Student();
		student2.setName("갑순");
		student2.setNumber(200);
		student2.setDepartment("건축학과");
		System.out.println(student2);
		
		System.out.println("-----------------");
		
		student2.setDepartment("수학과");
		System.out.println(student2.toString());
	}
}
