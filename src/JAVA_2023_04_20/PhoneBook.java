package JAVA_2023_04_20;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
}

public class PhoneBook {
	private Scanner sc;
	private Phone[] pArr;
	public PhoneBook() {
		
	}
	void read() {
		sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = sc.nextInt();
		pArr = new Phone[n];
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			pArr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다.");
	}
	String search(String name) {
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i].getName().equals(name)) {
				return pArr[i].getTel();
			}
		}
		return null;
	}
	void run() {
		read();
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			
			if(name.equals("그만")) {
				break;
			}
			
			String tel = search(name);
			
			if(tel == null) {
				System.out.println(name + "이 없습니다.");
			}
			else {
				System.out.println(name + "의 번호는 " + tel + "입니다.");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		new PhoneBook().run();
	}
}
