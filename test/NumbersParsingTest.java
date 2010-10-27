import junit.framework.Assert;

import org.junit.Test;


public class NumbersParsingTest {
	
	@Test
	public void shouldParse1() {
		
		String number;
		Assert.assertEquals(1, NumbersParser.parse(number));
		
	}
	
}
