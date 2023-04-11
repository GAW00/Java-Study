package JAVA_2023_04_03;

public class T_Student {
	private String Name;
	private int Number;
	private String Department;
	
	void getName() {
		System.out.println("이름 : " + Name);
	}
	void setName(String name) {
		Name = name;
	}
	void getNumber() {
		System.out.println("학번 : " + Number);
	}
	void setNumber(int number) {
		Number = number;
	}
	void getDepartment() {
		System.out.println("학과 : " + Department);
	}
	void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "이름 : " + Name +
			   "\n학번 : " + Number +
			   "\n학과 : " + Department;
	}
}
