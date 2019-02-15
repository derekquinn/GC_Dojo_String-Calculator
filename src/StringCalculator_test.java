
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculator_test {

	@Test
/// TC 7
	void StringCalculatorTest() {

// arrange
		String expected = "7";

// actual
		String actual = StringCalculator.add("7");

// assert
		assertEquals(expected, actual);

	}

	@Test
/// TC 0 
	void StringCalculatorTest2() {

// arrange
		String expected = "0";

// actual
		String actual = StringCalculator.add("0");

// assert
		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest3() {

// arrange
		String expected = "100";

// actual
		String actual = StringCalculator.add("100");

// assert
		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest4() {

		// arrange
		String expected = "5";

		// actual
		String actual = StringCalculator.add("2,3");

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest5() {

		// arrange
		String expected = "101";

		// actual
		String actual = StringCalculator.add("1,100");

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest6() {

		// arrange
		String expected = "15.6";

		// actual
		String actual = StringCalculator.add("7.5,8.1");

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest7() {
		// arrange
		String expected = "-65";

		// actual
		String actual = StringCalculator.add("-65");

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest8() {
		String expected = "-61";

		String actual = StringCalculator.add("-65,4");

		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest9() {
		String expected = "-89";

		String actual = StringCalculator.add("-65,-24");

		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest10() {
		String expected = "0";

		String actual = StringCalculator.add("");

		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest11() {

		String expected = "27";

		String actual = StringCalculator.add("21,6");

		assertEquals(expected, actual);

	}

	@Test
	void StringCalculatorTest12() {

		String expected = "43";

		String actual = StringCalculator.add("41,2");

		assertEquals(expected, actual);

	}

}
