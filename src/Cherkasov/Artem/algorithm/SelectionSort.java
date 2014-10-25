package Cherkasov.Artem.algorithm;

public class SelectionSort {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void selectionSort(Comparable[] a){
		int length = a.length;
		for(int i = 0; i < length; ++i){
			int min = i;
			for(int j = i + 1; j < length; ++j){
				if(a[j].compareTo(a[min]) < 0){
					min = j;
				}
			}
			
			Comparable buff = a[i];
			a[i] = a[min];
			a[min] = buff;
		}
	}

}
