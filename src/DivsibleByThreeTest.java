import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivsibleByThreeTest {

	@Test
	public void test() {
		CheckDivision cd = new CheckDivision();
		boolean one = cd.isDivisibleBy(10, 2);
		Assert.assertTrue(one);
		boolean two = cd.isDivisibleBy(3, 9);
		Assert.assertFalse(two);
		boolean three = cd.isDivisibleBy(0, 0);
		Assert.assertFalse(three);
		boolean four = cd.isDivisibleBy(100, 0);
		Assert.assertFalse(four);
	}

}
