package JAVA_2023_03_22;

class Weapon{
	protected int fire() {  // 파이어벳
		return 1; // 파이어벳 기본 공격력 = 1
	}
}

class Cannon extends Weapon{ // 시즈탱크
	@Override
	protected int fire() {
		return 10; // 시즈탱크 기본 공격력 = 10
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 데미지는 " + weapon.fire()); // 1
		weapon = new Cannon(); // Weapon weapon = new Cannon(); 업캐스팅 발생!
		System.out.println("전차의 데미지는 " + weapon.fire());	  // 10
	}
}

