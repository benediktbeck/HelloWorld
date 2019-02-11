package bubblesort;

public class bubblesort {
	public static void main(String[] args) {

		// Zahlen unsortiert ausgeben

		int[] zahlen = { 3, 6, 1, 9, 2, 5 };

		System.out.println("Unsortierte Zahlen:");

		for (int i = 0; i < zahlen.length; i++) {

			System.out.println(zahlen[i]);
		}

		// Zahlen sortieren

		System.out.println("-----------");

		for (int n = zahlen.length; n > 1; n--) {
			for (int i = 0; i < n - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {

					int help = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = help;
				}
			}
		}

		// sortierte Zahlen werden ausgegeben

		System.out.println("Sortierte Zahlen:");
		for (int i = 0; i < zahlen.length; i++) {

			System.out.println(zahlen[i]);
		}

	}
}
