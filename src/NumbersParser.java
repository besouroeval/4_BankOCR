
public class NumbersParser {

	public static int parse(String number) {
		if (number.charAt(1) == '_') {
			if (number.charAt(8) == '|') {
				return 3;
			} else {
				return 2;
				
			}
		}
		return 1;
	}

}
