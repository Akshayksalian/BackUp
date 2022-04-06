package jUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicValuesTest {

	private static SumNumbers s;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s = new SumNumbers();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@TestFactory
	public Stream<DynamicTest> testAddition(){
		int[][] data = new int[][] {{1,2,3},{5,3,8},{6,7,13}};
		return Arrays.stream(data).map(entry-> {
			int a = entry[0];
			int b = entry[1];
			int sum = entry[2];
			return dynamicTest(a+" + "+b+" + "+" = "+sum,()-> {
				assertEquals(sum,s.sum(a,b));
		});
	});

	}
	
	@TestFactory
	public List<DynamicTest> testArithmetic(){
		
		return Arrays.asList(dynamicTest("SumTest",()->
		assertEquals(11,s.sum(5,6))),
				dynamicTest("SubtractTest",()->
				assertEquals(14,s.subtraction(24, 10))));
	}
	
	
}
