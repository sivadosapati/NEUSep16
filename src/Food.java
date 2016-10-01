
public class Food {
	int price;

	Food() {
		System.out.println("Constructor");
		this.price = 10;
	}

	public void finalize() {
		System.out.println("Food is destroyed");
	}

	public static void main(String args[]) {
		Food f = new Food();
		System.out.println(f.price);
		Food ff = f;
		f = new Food();
		
		System.gc();
		System.out.println(f.price);
	}
}
