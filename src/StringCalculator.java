
public class StringCalculator {

	public static String add(String s) {
// 1 if input in blank return 0
		if (s == "") {
			return "0";
		}
// if input is 0 return is blank
		if (s == "0") {
			return "";
		}

// 2 do double math separated by commas
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

// 3 do int math with one negative number and one positive number

		if (s.contains("-") && s.contains(",")) {

			String[] values = s.split(",");

			String value89 = values[0];
			String value90 = values[1];

			int x = Integer.parseInt(value89);
			int y = Integer.parseInt(value90);

			int preResult = x + y;

			String result = Integer.toString(preResult);

			return result;

		}

// 4 do int math with one number separated by commas with negative numbers 		
		if (s.contains("-")) {

			String result = s;

			return result;

		}

// 5 do int math separated by commas 
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
