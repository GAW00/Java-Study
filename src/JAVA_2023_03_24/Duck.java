package JAVA_2023_03_24;

public class Duck extends Bird implements Swim2, Fly{
	

	@Override
	public void fly() {
		System.out.println("duck fies");
	}

	@Override
	public void swim() {
		System.out.println("duck swims");
	}
}
