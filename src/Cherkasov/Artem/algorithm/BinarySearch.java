package Cherkasov.Artem.algorithm;

@SuppressWarnings("unchecked")
public class BinarySearch {
	
	@SuppressWarnings("rawtypes")
	public static int binarySearch(Comparable[] orderedArray, Comparable element){
		
		int index_a = 0;
		int index_b = orderedArray.length;
		int half_a_b = (index_a + index_b)/2;
		
		while(index_a < index_b){
			if (element.compareTo(orderedArray[half_a_b]) == 0){
				return half_a_b;
			} else if (element.compareTo(orderedArray[half_a_b]) > 0){
				index_a = half_a_b;
			} else {
				index_b = half_a_b;
			}
			half_a_b = (index_a + index_b)/2;
		}

		return -1;
		
	}

}
