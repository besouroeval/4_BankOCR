
public class NumbersParser {

	public static int parse(String number) {
		String[] lines = new String[3];
		lines[0] = number.substring(0,4);
		if (number.charAt(1) == '_') {
			if (number.charAt(8) == '|') {
				return 2;
			} else {
				return 3;
				
			}
		}
		return 1;
	}

}
