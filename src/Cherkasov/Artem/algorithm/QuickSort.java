package Cherkasov.Artem.algorithm;

public class QuickSort {
	
	@SuppressWarnings("rawtypes")
	public static void quickSort(Comparable[] a, int min, int max){
		if(max <= min) return;
		int j = partition(a, min, max);
		quickSort(a, min, j - 1);
		quickSort(a, j + 1, max);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int partition(Comparable[] a, int min, int max){
		int i = min;
		int j = max + 1;
		Comparable element = a[min];
		
		while(true){
			while(a[++i].compareTo(element) < 0){
				if(i == max) break;
			}
			while(element.compareTo(a[--j]) < 0){
				if(j == min) break;
			}
			if(i >= j) break;
			Comparable buff = a[i];
			a[i] = a[j];
			a[j] = buff;
		}
		Comparable buff = a[min];
		a[min] = a[j];
		a[j] = buff;		
		return j;
	}

}
