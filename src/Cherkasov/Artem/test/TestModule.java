package Cherkasov.Artem.test;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import Cherkasov.Artem.algorithm.BinarySearch;

public class TestModule {
	BinarySearch<String> a;
	String[] s;
	
	@Before
	public void putData(){
		a = new BinarySearch<String>();
		s = new String[10];
		s[0] = "a";
		s[1] = "b";
		s[2] = "c";
		s[3] = "d";
		s[4] = "e";
		s[5] = "f";
		s[6] = "g";
		s[7] = "h";
		s[8] = "i";
		s[9] = "j";
	}
	
	@Test
	public void testData(){
		assertEquals(8, a.binarySearch(s, "i"));
	}
}
