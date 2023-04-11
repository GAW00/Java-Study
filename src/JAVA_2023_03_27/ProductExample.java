package JAVA_2023_03_27;

public class ProductExample {
	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<>();	// Product클래스의 타입파라미터 T가 TV타입으로, M이 String타입이 된다
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		
		TV tv = product1.getKind();	// new Tv()
		System.out.println(tv);		// JAVA_2023_03_27.TV@15db9742(패키지.클래스@해시코드)
		
		String tvModel = product1.getModel();  // "스마트TV"
		System.out.println(tvModel);		   // 스마트TV
		
		
		Product<Car, String> product2 = new Product<>(); // Product클래스의 타입파라미터 T가 Car타입으로, M이 String타입이 된다
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();	// new Car()
		System.out.println(car);		// JAVA_2023_03_27.Car@6d06d69c(패키지.클래스@해시코드)
		
		String carModel = product2.getModel();	// "디젤"
		System.out.println(carModel);			// 디젤
	}
}
