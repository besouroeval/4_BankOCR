import java.util.StringTokenizer;


public class NumbersParser {

	public static int parse(String number) {
		
		String[][] digits = breakeLines(number);
		
		int position = 1;
		int parsed = 0;
		for (int i = digits.length-1; i >= 0; i--) {
			parsed += position * parseOneDigit(digits[i]);
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
		
		StringTokenizer tok = new StringTokenizer(number, "\n", false);
		
		for (int i = 0; i < 3; i++) {
			String line = tok.nextToken();
			for (int j=0 ; j<qtdDigits ; j++) {
				lines[j][i] = line.substring(0+3*j,3+3*j);
			}
		}		

		return lines;
	}

}
