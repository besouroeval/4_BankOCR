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
	
	@Test
	public void shouldParse2() {
		
		String number = " _ \n" 
					  + " _|\n"
					  + "|_ \n";
		
		Assert.assertEquals(2, NumbersParser.parse(number));
		
	}

	@Test
	public void shouldParse3() {
		
		String number = " _ \n" 
					  + " _|\n"
					  + " _|\n";
		
		Assert.assertEquals(3, NumbersParser.parse(number));
		
	}


}
