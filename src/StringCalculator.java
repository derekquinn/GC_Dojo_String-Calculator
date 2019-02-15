
public class StringCalculator {

	public static String add(String s) {
// if input in blank return 0
		if (s == "") {
			return "0";
		}
// do math separate by commas 
		if (s.contains(",")) {

			String[] values = s.split(",");
			String value1 = values[0];
			String value2 = values[1];

			int x = Integer.parseInt(value1);
			int y = Integer.parseInt(value2);

			int preResult = x + y;

			String result = Integer.toString(preResult);

			return result;

		}

		return s;

	}

}
