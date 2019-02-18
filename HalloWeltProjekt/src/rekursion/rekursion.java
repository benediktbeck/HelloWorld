package rekursion;

public class rekursion {

	public static void main(String[] args) {
		ausgabe1(10000);
	}

	public static void ausgabe1(int zahl) {
		// Das ist eine Rekursion
		// Das ist die Abbruchbedingung
		if (zahl == 0)
			return;
		//
		zahl = zahl / 3;
		System.out.println(zahl);
		// Rekursiver Aufruf
		ausgabe1(zahl);
	}

}
