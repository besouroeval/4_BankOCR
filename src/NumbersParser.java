
public class NumbersParser {

	public static int parse(String number) {
		if (number.charAt(1) == '_') {
			return 2;
		}
		return 1;
	}

}
