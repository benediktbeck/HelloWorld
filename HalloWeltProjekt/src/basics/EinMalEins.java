package basics;

public class EinMalEins {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i = i + 1) {
			System.out.print(i + "er Reihe:\t");
			for (int j = 1; j < 11; j = j + 1) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}
