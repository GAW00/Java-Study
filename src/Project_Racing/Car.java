package Project_Racing;

class Car{
	int cc; // 배기량
	double x, vx; // 위치 좌표, 속도
	String model; boolean ngin=false;
	
	Car(String 모델,int 배기량,float x0){
		model = 모델; cc = 배기량; x = x0;
	}
	void info() {try {Thread.sleep(400); System.out.println(model + "입니다.\n");}catch(Exception e) {}}
	void start() {try {Thread.sleep(400); ngin=true;System.out.println("-Ready-\n");}catch(Exception e) {} }
	boolean move() {
		vx = spurt(); //simulation
		x += vx;
		display();
		System.out.println(model + "at " + (int)x + "\n"); //문자 방송
		return ingoal(); // 골인 여부
	}
	double spurt() {return (Math.random() - 0.3) * 30;}
	void display() {
		for(int i = 0; i < x; i += 5)System.out.print("-");
		System.out.print(" :=:- ");
	}
	boolean ingoal() {return x > 300;}
	void reset() {x = 0;}
}
