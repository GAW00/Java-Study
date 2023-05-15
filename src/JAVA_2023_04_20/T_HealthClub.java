package JAVA_2023_04_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T_HealthClub {
	private static int memberCount = 0;
	
	public static void main(String[] args) {
		initProg();
	}
	public static void initProg() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======= 헬스클럽 회원관리 프로그램 =======");
			System.out.println("1. 회원 정보관리  |  2. 프로그램 종료");
			System.out.println("==================================");
			System.out.println("메뉴를 선택하세요. >>");
			
			int menu = set_Int();
			int result = slctMenu(menu);
			if(result == -1) break;
		}
		sc.close();
	}
	public static int slctMenu(int m) {
		if(m == 1) {memberManage(); return 1;}
		else if(m == 2) return -1;
		else {System.out.println("잘못된 숫자입니다."); return 1;}
	}
	public static void memberManage() {
		List<String> member = new ArrayList<String>();
		while(true){
			System.out.println("============================ 일반회원 정보 관리 ============================");
			System.out.println("11. 일반회원 정보입력  |  22. 일반회원 정보삭제  |  33. 일반회원 정보확인  |  0. 이전단계");
			System.out.println("======================================================================");
			System.out.println("메뉴를 선택하세요. >>");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			if(menu == 0) break;
			member = slctMenu_1(menu, member);
		}
	}
	public static List<String> slctMenu_1(int m, List<String> member) {
		if(m == 11) member = setMember(registMember(), member);
		else if(m == 22) member = dltMember(member);
		else if(m == 33) searchMember(member);
		else System.out.println("잘못된 입력입니다.");
		return member;
	}
	public static int registMember() {
		System.out.println("가입할 회원 수를 입력하세요>> ");
		return set_Int();
	}
	public static List<String> setMember(int n, List<String> member) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = memberCount; i < memberCount + n; i++) {
			System.out.println("회원정보를 입력하세요>> ");
			System.out.print("회원 아이디 : ");
			String m_id = set_Str();
			System.out.print("회원 이름 : ");
			String m_name = set_Str();
			System.out.print("회원 지역 : ");
			String m_native = set_Str();
			
			sb.append(m_id);
			sb.append("/");
			sb.append(m_name);
			sb.append("/");
			sb.append(m_native);
			
			member.add(i, sb.toString());
			sb.setLength(0);
			
			System.out.println("****************************");
		}
		return member;
	}
	public static List<String> dltMember(List<String> member) {
		member.clear();
		return member;
	}
	public static void searchMember(List<String> member) {
		int count = member.size();
		System.out.println("등록된 회원 수는 " + count + "입니다.");
		for(int i = 0; i < count; i++) {
			String[] memInf = member.get(i).split("/");
			System.out.println("회원 번호 : " + i);
			System.out.println("회원 아이디 : " + memInf[0]);
			System.out.println("회원 이름 : " + memInf[1]);
			System.out.println("회원 지역 : " + memInf[2]);
			System.out.println("****************************");
		}
	}
	public static int set_Int() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	public static String set_Str() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		return str;
	}
}
