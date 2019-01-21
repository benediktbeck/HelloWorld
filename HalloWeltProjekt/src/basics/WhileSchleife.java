package basics;

public class WhileSchleife {
	public static void main(String[] args) {
		// while...
		int zahl1 = 120;
		int zahl2 = zahl1;

		while (zahl1 > 0) {
			if ((zahl2 % zahl1) == 0)
				System.out.println("Das ist ein Teiler: " + zahl1 + "!");
			zahl1 = zahl1 - 1;

		}

	}

}
