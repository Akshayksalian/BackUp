package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class SumNumbers2Test {
	
	private static SumNumbers sn;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sn = new SumNumbers();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		sn = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before a testCase");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After a testCase");
	}

	@Test
	void SumTest() {
		assertEquals(11, sn.sum(6,5));
	}

	@RepeatedTest(5)
	@Test
	void sumNegativeTest() {
		assertNotEquals(11,sn.sum(6, 7));
	}
	
	@DisplayName("Testing Exception")
	@Test
	void exceptionTest() {
		Exception e = assertThrows(IllegalArgumentException.class,()->sn.sum(12,3));
		assertEquals("Values should be greather than 10", e.getMessage());
	}

}
