package Cherkasov.Artem.algorithm;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		CountingSort cs = new CountingSort();
		int MIN = 1;
		int MAX = 20;
		int[] a = new int[MAX];
		
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
		
		for (int i = 0; i < MAX; ++i){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		cs.countingSort(a, MIN, MAX);
		
		for (int i = 0; i < MAX; ++i){
			System.out.print(a[i] + " ");
		}

	}

}
