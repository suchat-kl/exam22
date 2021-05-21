
public class Exam22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bark();
		method2();
		method3();
	}

	private static void bark() {
		String dogName = "Puddle";
		System.out.println("The Dog name =" + dogName + " bark");
	}

	private static void method2() {
		float f = 2.3F;
		int i = 5;
		double d = 823.99D;
		char c = 'A';
		System.out.println("float -> int " + (int) f);
		System.out.println("int -> float " + i);
		System.out.println("double -> float " + (float) d);
		System.out.println("char -> int " + (int) c);
	}

	private static void method3() {
		final String hello = "Hello";
		hello = "World";
	}
}
