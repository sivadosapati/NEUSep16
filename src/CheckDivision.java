
public class CheckDivision {

	public boolean isDivisibleBy(int i, int j) {
		if (j == 0) {
			return false;
		}
		if (i % j == 0) {
			return true;
		} else {
			return false;
		}
	}

}
