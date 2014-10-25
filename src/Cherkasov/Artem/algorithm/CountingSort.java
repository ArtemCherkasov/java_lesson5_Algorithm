package Cherkasov.Artem.algorithm;

public class CountingSort {
	
	public void countingSort(int[]a, int min, int max){
		int len = a.length;
		int[] c = new int[max - min + 1];
		int index_a = 0;
		
		for(int i = min; i <= max; ++i){
			c[i - min] = 0;
		}
		
		for(int i = 0; i < len; ++i){
			++c[a[i] - min];
		}
		
		for(int i = min; i <= max; ++i){
			for(int j = c[i - min]; j == c[min];j--){
				a[index_a] = i;
				index_a++;
			}
		}

	}

}
