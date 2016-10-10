
public class CowsAndBulls {
	public CowNBull find(String a, String b) {
		int cows = 0;
		int bulls = 0;
		char first[] = a.toCharArray();
		char second[] = b.toCharArray();
		//Logic..
		CowNBull cnb = new CowNBull(cows, bulls);
		return cnb;
	}
}

class CowNBull {
	private int cows;
	private int bulls;

	public CowNBull(int c, int b) {
		this.cows = c;
		this.bulls = b;
	}
	public int getCows(){
		return cows;
	}

	public String toString() {
		return "cows -> " + cows + " : bulls -> " + bulls;
	}
}
