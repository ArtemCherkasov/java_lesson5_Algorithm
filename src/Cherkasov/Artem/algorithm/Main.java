package Cherkasov.Artem.algorithm;

public class Main {

	public static void main(String[] args) {
		BinarySearch<String> a = new BinarySearch<String>();
		String[] s = new String[10];
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
		System.out.println(a.binarySearch(s, "j"));
	}

}
