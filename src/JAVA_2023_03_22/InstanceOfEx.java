package JAVA_2023_03_22;

/*
 * instanceof 연산자 사용(상속)
 */
class Person {
}

class Researcher extends Person{
}

class Student extends Person{
}

class Professor extends Person{
}

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person) {				// 학생 객체가 사람이면
			System.out.print("Person "); 		// 참이면 출력
		}
		if(p instanceof Student) { 				// 학생 객체가 학생이면
			System.out.print("Student "); 		// 참이면 출력
		}
		if(p instanceof Researcher) {			// 학생 객체가 연구자면
			System.out.print("Researcher "); 	// 참이면 출력
		}
		if(p instanceof Professor) {			// 학생 객체가 교수면
			System.out.print("Professor "); 	// 참이면 출력
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() -> "); print(new Student()); // Person p = Student() --> 업캐스팅!
		System.out.print("new Researcher() -> "); print(new Researcher()); // Person p = Researcher() --> 업캐스팅!
		System.out.print("new Professor() -> "); print(new Professor()); // Person p = Professor() --> 업캐스팅!
	}
}

