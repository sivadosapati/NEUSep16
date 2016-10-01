import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class iPhoneTest {

	@Test
	public void test() {
		iPhone iphone = new iPhone(iPhone.WHITE);
		Assert.assertTrue(iphone.color.equals(iPhone.WHITE));
		Assert.assertTrue(iphone.version == 5);
		Assert.assertTrue(iphone.ram == 64);
		Assert.assertTrue(iphone.price == 199);

		iphone = new iPhone(6, 128);
		Assert.assertTrue(iphone.color.equals(iPhone.WHITE));
		Assert.assertTrue(iphone.version == 6);
		Assert.assertTrue(iphone.ram == 128);
		Assert.assertTrue(iphone.price == 499);

		iphone = new iPhone();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
