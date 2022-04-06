package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyUnitMethodTest {

	private static MyUnitMethod m ;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m = new MyUnitMethod();
	}

	@Test
	void concatTest() {
		assertEquals("AkshaySalian",m.stringConcat("Akshay","Salian"));
	}
	
	@Test
	void concatTest1() {
		assertEquals("Akshay Salian",m.stringConcat("Akshay"," Salian"));
	}
	
	@Test
	void concatNegativeTest() {
		assertNotEquals("SalianAkshay",m.stringConcat("Akshay","Salian"));
	}

}
