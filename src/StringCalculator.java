
public class StringCalculator {

	public static String add(String s) {
// if input in blank return 0
		if (s == "") {
			return "0";
		}

// do double math separated by commas
		if (s.contains(",") && s.contains(".")) {

			String[] values = s.split(",");

			String value3 = values[0];
			String value4 = values[1];

			double x = Double.parseDouble(value3);
			double y = Double.parseDouble(value4);

			double preResult = x + y;

			String result = Double.toString(preResult);

			return result;

		}
// do int math separated by commas 
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
// do int math separated by commas with negative numbers 

		return s;
	}
}
