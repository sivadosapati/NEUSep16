
public class AirBnB {
	public static void main(String args[]) {
		
		AirBnB airBnB = new AirBnB();
		
		TwoBedHome homeInSeattle = new TwoBedHome();
		homeInSeattle.pricePerNight = 150;
		homeInSeattle.setBedRooms(2);
		System.out.println(homeInSeattle.toString() + " -> " + homeInSeattle.hashCode());

		homeInSeattle.setYardAvailable(false);
		System.out.println(homeInSeattle.getTotalPrice(3));
		Condominium condoInBallard = new Condominium();
		condoInBallard.pricePerNight = 75;
		condoInBallard.setBedRooms(1);
		// System.out.println(condoInBallard.getBedRooms());
		System.out.println(condoInBallard.getTotalPrice(3));

		ThreeBedHome homeInBothell = new ThreeBedHome();
		homeInBothell.pricePerNight = 200;
		homeInBothell.setBedRooms(3);
		System.out.println(homeInBothell);
		homeInBothell.setBalcony(false);
		System.out.println(homeInBothell.getTotalPrice(3));
		homeInBothell.setBalcony(true);
		System.out.println(homeInBothell.getTotalPrice(3));

	}
}
