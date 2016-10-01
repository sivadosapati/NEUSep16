import org.junit.Assert;
import org.junit.Test;

public class StringsTest {

	@Test
	public void testForBasicScenario() {
		Strings strings = new Strings();
		String sentence = "I love Seattle";
		String expectedReverseSentence = "Seattle love I";
		String output = strings.reverseWords(sentence);
		Assert.assertEquals(output, expectedReverseSentence);

	}

	@Test
	public void testForWhenAStringHasALotOfSpacesInBetween() {
		Strings strings = new Strings();
		String sentence = "I      love     Seattle";
		String expectedReverseSentence = "Seattle     love      I";
		String output = strings.reverseWords(sentence);
		Assert.assertEquals(output, expectedReverseSentence);

	}

}
