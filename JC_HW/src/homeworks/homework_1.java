package homeworks;

public class homework_1 {

	public static void main(String[] args) {

		System.out.println("Zavdannya 1");

		boolean a = false;
		char b = 'A';
		byte c = 0;
		short d = 1;
		int e = 2;
		long f = 1234;
		float j = 5.1f;
		double h = 5.55;

		System.out.println("Boolean = " + Boolean.FALSE);
		System.out.println("Character = " + Character.MAX_RADIX);
		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println("Integer = " + Integer.MAX_VALUE);
		System.out.println("Long = " + Long.MAX_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);

		System.out.println("Zavdannya 2");

		System.out.println("Boolean = " + Boolean.TRUE);
		System.out.println("Character = " + Character.MIN_RADIX);
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Integer = " + Integer.MIN_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);

		System.out.println("Zavdannya 3");

		int[] array = { 7, 9, 11, 32, 1, 74, 92, 15, 17, 2 };
		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("max = " + max);

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
			min = array[i];
			
		}
		System.out.println("min = " + min);
		
		System.out.println("FIRST COMMIT FOR GITHUB");
	}

}
