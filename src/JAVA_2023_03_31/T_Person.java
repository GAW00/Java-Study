package JAVA_2023_03_31;

public class T_Person {
	String lastName;
	String firstName;
	
	String getLastName() {
		return lastName;
	}
	String getFirstName() {
		return firstName;
	}
	int getLength() {
		return lastName.length() + firstName.length();
	}
}
