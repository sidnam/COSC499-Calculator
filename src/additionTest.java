import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class additionTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		int output = test.addition(2, 2);
		assertEquals(4,output);
	}

} 
