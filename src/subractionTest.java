import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subractionTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		int output = test.subraction(4, 2);
		assertEquals(2,output);
	}

}
