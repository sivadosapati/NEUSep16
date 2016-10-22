

public class iPhone {

	public static final String WHITE = "white";
	public String color;
	public int version;
	double price;
	String provider;
	int ram;

	void iPhone(String color){
		
	}
	public iPhone(String color) {
		this(5, 64);
	}

	public iPhone(int version, int ram) {
		this(version, ram, WHITE);
		// this.version = version;
		// this.ram = ram;
		// this.color = "white";
		// findPrice();
	}

	public iPhone(int version, int ram, String color) {
		System.out.println("Hello");
		this.version = version;
		this.ram = ram;
		this.color = color;
		this.provider = "ATT";
		findPrice();
	}

	public iPhone() {
		this(5,64,iPhone.WHITE);
	}

	void findPrice() {
		if (version == 5 && ram == 64) {
			price = 199;
		}
		if (version == 5 && ram == 128) {
			price = 299;
		}
		if (version == 5 && ram == 256) {
			price = 399;
		}
		if (version == 6 && ram == 64) {
			price = 459;
		}
		if (version == 6 && ram == 128) {
			price = 499;
		}

	}

}
