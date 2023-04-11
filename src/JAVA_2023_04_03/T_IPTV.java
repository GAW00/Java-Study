package JAVA_2023_04_03;

public class T_IPTV extends ColorTV{
	private String ip;
	
	public T_IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + " ");
		super.printProperty();
	}

	public static void main(String[] args) {
		T_IPTV iptv = new T_IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
