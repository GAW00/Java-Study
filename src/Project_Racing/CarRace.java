package Project_Racing;

import java.util.Scanner;

public class CarRace {
	Car[] cars = new Car[10];
	String[] names = {"1.프라이드", "2.페라리", "3.푸조", "4.소나타", "5.그랜저", "6.제네시스", "7.맥라렌", "8.티코", "9.람보르기니", "10.벤츠"};
	int[] CC = {1500, 5000, 3000, 3500, 4000, 4400, 7200, 1800, 6000, 4200};
	
	CarRace(){ // 생성자와 반복문으로 자동차 10대의 정보를 입력한다
		for(int i = 0; i < 10; i++) {
			cars[i] = new Car(names[i], CC[i], 0);
		}
	}
	
	void rollcall() { for(int i = 0; i < 10; i++) {cars[i].info();}}
	void predict() { // 출전 자동차들의 cc를 비교하여 우승 후보를 예측하는 메소드
			System.out.println("유력한 우승 후보는 ");
			choose_candidate(cars);
			System.out.println("입니다!\n");
			try {Thread.sleep(1000);}catch(Exception e) {}
	}
	void choose_candidate(Car cars[]) { // CC배열을 돌며 가장 큰 배기량 값을 가진 자동차를 추려내는 메소드
		int result = CC[0], carnum = 0;
		for(int i = 1; i < 10; i++) {
			if(result < CC[i]) {
				result = CC[i];
				carnum = i;
			}
		}
		System.out.println(names[carnum]);
	}
	void start() { for(int i = 0; i < 10; i++) {cars[i].start();}}
	void run() {
		Car winner = null;
		int t = 0;
		do{
			System.out.println("\n\n.............................................................!결승선(300m)!");
			System.out.println(++t + "))");
			for(int i = 0; i < 10; i++) {
				if(cars[i].move() == true) winner = cars[i];
			}
			try {Thread.sleep(700);}catch(Exception e) {}
		}while(winner == null);
		System.out.println("축하 합니다! 오늘의 승자는 "); winner.info();
	}
	boolean replay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("다시 하시겠습니까(Yes / No)>> ");
		String yn = sc.next();
		if(yn.toUpperCase().equals("YES")) {
			for (int i = 0; i < cars.length; i++) {
				cars[i].reset();
			}
			return true;
		}
		else if(yn.toUpperCase().equals("NO")) {sc.close(); return false;}
		else {System.out.println("잘못된 입력입니다"); sc.close(); return false;}
	}
	
	
	public static void main(String[] args) {
		CarRace cr = new CarRace();
		cr.rollcall();
		cr.predict();
		cr.start();
		do {
			try {Thread.sleep(1000);}catch(Exception e) {}
			cr.run();
		}while(cr.replay());
	}
}
