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

	@Test
	public void shouldParse4() {
		
		String number = "   \n" 
					  + "|_|\n"
					  + "  |\n";
		
		Assert.assertEquals(4, NumbersParser.parse(number));
		
	}
	
	@Test
	public void shouldParse5() {
		
		String number = " _ \n" 
					  + "|_ \n"
					  + " _|\n";
		
		Assert.assertEquals(5, NumbersParser.parse(number));
		
	}
	
	@Test
	public void shouldParse6() {
		
		String number = " _ \n" 
					  + "|_ \n"
					  + "|_|\n";
		
		Assert.assertEquals(6, NumbersParser.parse(number));
		
	}
	
	@Test
	public void shouldParse7() {
		
		String number = " _ \n" 
					  + "  |\n"
					  + "  |\n";
		
		Assert.assertEquals(7, NumbersParser.parse(number));
		
	}
	
	@Test
	public void shouldParse8() {
		
		String number = " _ \n" 
					  + "|_|\n"
					  + "|_|\n";
		
		Assert.assertEquals(8, NumbersParser.parse(number));
		
	}
	
	@Test
	public void shouldParse9() {
		
		String number = " _ \n" 
					  + "|_|\n"
					  + " _|\n";
		
		Assert.assertEquals(9, NumbersParser.parse(number));
		
	}
	
	@Test
	public void shouldParse0() {
		
		String number = " _ \n" 
					  + "| |\n"
					  + "|_|\n";
		
		Assert.assertEquals(0, NumbersParser.parse(number));
		
	}
	
	@Test
	public void shouldParseTwoDigits() {
		
		String number = " _  _ \n" 
					  + "|_||_|\n"
					  + "|_||_|\n";
		
		Assert.assertEquals(88, NumbersParser.parse(number));
		
	}
	
	

}
