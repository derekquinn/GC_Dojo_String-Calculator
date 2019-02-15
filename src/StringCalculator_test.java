
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

	void StringCalculatorTest5() {
		


	}

	void StringCalculatorTest6() {

	}

	void StringCalculatorTest7() {

	}

	void StringCalculatorTest8() {

	}

	void StringCalculatorTest9() {

	}

	void StringCalculatorTest10() {

	}

	void StringCalculatorTest11() {

	}

	void StringCalculatorTest12() {

	}

}
