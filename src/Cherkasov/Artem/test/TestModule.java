package Cherkasov.Artem.test;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import Cherkasov.Artem.algorithm.BinarySearch;
import Cherkasov.Artem.algorithm.CountingSort;
import Cherkasov.Artem.algorithm.SelectionSort;

public class TestModule {

	String[] s;
	int[] a;
	Integer[] a_selectionSort;
	int MIN = 1;
	int MAX = 20;
	
	@Before
	public void putDataBinarySearch(){

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
	
	@Before
	public void putDataSelectionSort(){
		a_selectionSort = new Integer[MAX];
		
		for(int i = 0; i < MAX; ++i){
			a_selectionSort[i] = i + 1;
		}
		
		for(int i = 0; i < 200; ++i){
			int j = new Random().nextInt(MAX);
			int k = new Random().nextInt(MAX);
			int buf = a_selectionSort[j];
			a_selectionSort[j] = a_selectionSort[k];
			a_selectionSort[k] = buf;
		}

	}
	
	@Test
	public void testDataBinarySearch(){
		assertEquals(8, BinarySearch.binarySearch(s, "i"));
	}
	
	@Test
	public void testDataCountingSort(){
		CountingSort.countingSort(a, MIN, MAX);
		int[] checkArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		assertArrayEquals(checkArray, a);
	}
	
	@Test
	public void testDataSelectionSort(){

		SelectionSort.selectionSort(a_selectionSort);
		Integer[] checkArray = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		assertArrayEquals(checkArray, a_selectionSort);
	}
	
}
