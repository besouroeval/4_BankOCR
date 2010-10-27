import junit.framework.Assert;

import org.junit.Test;


public class NumbersParsingTest {
	
	@Test
	public void shouldParse1() {
		
		String number = "   \n" 
					  + "  |\n"
					  + "  |\n";
		
		Assert.assertEquals(1, NumbersParser.parse(number));
		
	}
	
}
