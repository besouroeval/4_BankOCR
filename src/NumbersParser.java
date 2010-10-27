
public class NumbersParser {

	public static int parse(String number) {
		
		String[] lines = breakeLines(number);
		
		if (lines[0].charAt(1) == '_') {
			
			if (lines[1].charAt(1) == ' ') {
				return 7;
				
			} else {
				
				if (lines[2].charAt(0) == ' ') {
					return 2;
					
				} else {
					
					if (lines[2].charAt(0) == '|') {
						
						if (lines[2].charAt(2) == '|') {
							
							if (lines[1].charAt(2) == '|') {
								return 8;
								
							} else {
								return 6;
								
							}
							
						} else {
							return 0;
						}
						
					} else if (lines[1].charAt(0) == '|') {
						return 5;
						
					} else {
						return 3;
						
					}
					
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

	private static String[] breakeLines(String number) {
		String[] lines = new String[3];
		lines[0] = number.substring(0,3);
		lines[1] = number.substring(4,7);
		lines[2] = number.substring(8,11);
		return lines;
	}

}
