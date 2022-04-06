package jUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumNumbersTest {
	
	public SumNumbersTest(){
		
	}
	
	SumNumbers sn = new SumNumbers();
	
	@Test
	void SumTest() {
		assertEquals(11, sn.sum(6,5));
	}

	@Test
	void sumNegativeTest() {
		assertNotEquals(11,sn.sum(6, 7));
	}

}
