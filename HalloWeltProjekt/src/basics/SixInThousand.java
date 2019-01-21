package basics;

public class SixInThousand {
	public static void main(String[] args) {
		int y = 0;
		for (int i = 1; i <= 1000; i = i + 1) {
			if ((i % 6) == 0)
				y++;

		}

		System.out.println("Es gibt " + y + " Zahlen die der Bedingung entsprechen!");

	}
}