
public class HalloWelt {

	public static void main(String[] args) {
		System.out.println("Hallo Welt! Mein Name ist Benedikt!");
		System.out.println("Zahlen auch ohne Anführungszeichen!");
		System.out.println(1);
		System.out.println("1+1=" + (1 + 1));
		System.out.println(9 / 2);
		System.out.println(9 / 4.0);
		//
		boolean booleanVariable = true;
		// Der boolean ist ein Variablen Typ
		System.out.println(booleanVariable);
		// Geht nur einmal (boolean booleanVariable = false;)
		// Werte können aber mehrfach zugewiesen werden
		booleanVariable = false;
		System.out.println(booleanVariable);
		//
		// 8 bit - von -128...127
		byte byteVariable = 71;
		System.out.println(byteVariable);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		// 16 bit - von 0...65.535
		char charVariable = 'x';
		System.out.println(charVariable);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		// String = mehrere Chars verkettet
		String stringVariable = "StringWert";
		System.out.println(stringVariable);
		System.out.println(stringVariable.length());
		System.out.println(stringVariable.charAt(5));
		//
		// Zahlen
		// Short - 16 bit von -32.768...32.767
		short shortVariable = 236;
		System.out.println(shortVariable);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		// int - 32 bit
		int intVariable = 2345678;
		System.out.println(intVariable);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		// long - 64 bit
		long longVariable = 1234567890;
		System.out.println(longVariable);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		// float - 32 bit
		float floatVariable = 123.456F;
		System.out.println(floatVariable);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		// double 64 bit
		double doubleVariable = 123.456789;
		System.out.println(doubleVariable);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

	}

}
