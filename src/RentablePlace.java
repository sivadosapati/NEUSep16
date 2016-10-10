
public class RentablePlace {
	private int bedRooms;
	private int bathRooms;
	private boolean occupied;
	private String location;
	public float pricePerNight;
	private Owner owner;

	public RentablePlace(int bedRooms) {
		this.bedRooms = bedRooms;
	}

	public RentablePlace() {
	}

	public float getTotalPrice(int nights) {
		System.out.println("getTotalPrice() in RentablePlace");
		return findDefaultTotalPrice(nights);
	}

	protected float findDefaultTotalPrice(int nights) {
		return Math.round(nights * pricePerNight);
	}

	public int getBedRooms() {
		return bedRooms;
	}

	public void setBedRooms(int br) {
		this.bedRooms = br;
	}
}

class Owner {
	String name;
	String phoneNumber;
}

class Condominium extends RentablePlace {
	public Condominium() {
		super(0);
	}
}

class Home extends RentablePlace {
	private boolean yardAvailable;

	public void setYardAvailable(boolean b) {
		this.yardAvailable = b;
	}

	public boolean isYardAvailable() {
		return yardAvailable;
	}

	@Override
	public float getTotalPrice(int nights) {
		System.out.println("getTotalPrice() in Home");
		if (nights < 2) {
			return super.getTotalPrice(nights);
		} else {
			float f = super.getTotalPrice(nights);
			return f - f * 0.1f;
		}
	}
}

class TwoBedHome extends Home {

	public void applyWaterToTheLawn() {
		if (isYardAvailable()) {
			// Do something
		}
	}

	@Override
	public String toString() {
		return "Beds -> " + getBedRooms() + " Price -> " + pricePerNight;
	}

}

class ThreeBedHome extends Home {
	private boolean balcony;

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	@Override
	public float getTotalPrice(int nights) {
		if (isBalcony() == false) {
			return findDefaultTotalPrice(nights);
		} else {
			return super.getTotalPrice(nights);
		}
	}

}
