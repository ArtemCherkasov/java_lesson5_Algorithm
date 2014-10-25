package Cherkasov.Artem.test;


import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import Cherkasov.Artem.algorithm.BinarySearch;
import Cherkasov.Artem.algorithm.CountingSort;

public class TestModule {
	BinarySearch<String> bs;
	String[] s;
	CountingSort cs;
	int[] a;
	int MIN = 1;
	int MAX = 20;
	
	@Before
	public void putDataBinarySearch(){
		bs = new BinarySearch<String>();
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
	
	@Before
	public void putDataCountingSort(){
		cs = new CountingSort();
		a = new int[MAX];
		
		for(int i = 0; i < MAX; ++i){
			a[i] = i + 1;
		}
		
		for(int i = 0; i < 200; ++i){
			int j = new Random().nextInt(MAX);
			int k = new Random().nextInt(MAX);
			int buf = a[j];
			a[j] = a[k];
			a[k] = buf;
		}

	}
	
	@Test
	public void testDataBinarySearch(){
		assertEquals(8, bs.binarySearch(s, "i"));
	}
	
	@Test
	public void testDataCountingSort(){
		cs.countingSort(a, MIN, MAX);
		int[] checkArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		assertArrayEquals(checkArray, a);
	}
	
}
