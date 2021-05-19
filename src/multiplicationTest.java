import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiplicationTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		int output = test.multiplication(4, 4);
		assertEquals(16,output);
	}

}
