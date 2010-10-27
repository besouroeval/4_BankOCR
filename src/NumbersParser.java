
public class NumbersParser {

	public static int parse(String number) {
		String[] lines = new String[3];
		lines[0] = number.substring(0,3);
		lines[1] = number.substring(4,7);
		lines[2] = number.substring(8,11);
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
