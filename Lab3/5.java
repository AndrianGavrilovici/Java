/* 1) Să se calculeze 7+14+21+28+…+98, 3*6*9*12*…*33 */
class Main {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 7; i <= 98; i += 7) {
			System.out.print(i);
			a += i;
			if (i < 98) System.out.print("+");
		}
		System.out.println("="+ a);
		for (int i = 3; i <= 33; i += 3) {
			System.out.print(i);
			b *= i;
			if (i < 33) System.out.print("*");
		}
		System.out.println("=" + b );
	}
}