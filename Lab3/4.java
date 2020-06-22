/* 2) Să se afişeze toate numerele de două cifre care adunate cu răsturnatul lor dau 55. */
class Main {
	public static void main(String[] args) {
		int n1,n2;
		for (int a = 1; a <= 9; ++a)
			for (int b = 1; b <= 9; ++b) {
				n1 = a * 10 + b;
				n2 = b * 10 + a;
				if (n1 + n2 == 55) System.out.println(n1);
			}
	}
}