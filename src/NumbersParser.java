
public class NumbersParser {

	public static int parse(String number) {
		
		String[][] digits = breakeLines(number);
		
		int position = 1;
		int parsed = 0;
		for (int i = digits.length-1; i >= 0; i--) {
			parsed = position * parseOneDigit(digits[i]);
			position *= 10;
		}
		
		return parsed;
		
	}

	private static int parseOneDigit(String[] lines) {
		if (lines[0].charAt(1) == '_') {
		
			if (lines[2].charAt(2) == ' ') {
				return 2;
				
			} else if (lines[1].charAt(1) == ' ') {
				
				if (lines[2].charAt(1) == '_') {
					return 0;
					
				} else {
					return 7;
					
				}
					
				
			} else {
					
				if (lines[2].charAt(0) == '|') {
							
					if (lines[1].charAt(2) == '|') {
						return 8;
						
					} else {
						return 6;
						
					}
						
				} else if (lines[1].charAt(0) == '|') {
					
					if (lines[1].charAt(2) == '|') {
						return 9;
						
					} else {
						return 5;
						
					}
					
				} else {
					return 3;
					
				}
				
			}
			
		} else {
			
			if (lines[1].charAt(1) == '_') {
				return 4;
				
			} else {
				return 1;
				
			}
			
		}
	}

	private static String[][] breakeLines(String number) {
		
		int lineLength = number.indexOf("\n");
		int qtdDigits = lineLength/3;
		
		String[][] lines = new String[qtdDigits][3];
		
		
		for (int i = 0; i < 3; i++) {
			
		}
		for (int i=0 ; i<qtdDigits ; i++) {
			lines[i][0] = number.substring(0+3*i, 3+3*i);
			lines[i][1] = number.substring(lineLength+3*i, 7);
			lines[i][2] = number.substring(lineLength*2+3*i, 11);
		}
		
//		lines[0][0] = number.substring(0,3);
//		lines[0][1] = number.substring(4,7);
//		lines[0][2] = number.substring(8,11);
		
		return lines;
	}

}
