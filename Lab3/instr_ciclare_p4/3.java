/* 4) Să se afişeze perechile de numere a şi b care satisfac relaţiile a+b=1000; 17 divide pe a şi 19 divide pe b. */
class Main {
	public static void main(String[] args) {
		int a,b;
		for (a = 17; a < 1000; a += 17) {
			b = 1000 - a;
			if ((a % 17) == 0 && (b % 19) == 0)
				System.out.printf("%d\t%d\n",a,b );
		}
	}
}