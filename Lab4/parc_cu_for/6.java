/* 14) Un lot de pământ este împărţit în n parcele dreptunghiulare, numerotate de la 1 la n. Se citesc perechile de numere care reprezintă lungimea şi lăţimea fiecărei parcele. Să se afişeze suma ariilor parcelelor şi valoarea celei mai mari suprafeţe. Exemplu: Date de intrare: n=3, lungime=10 latime=5 lungime=15 latime=10 lungime=12 latime=5 Date de ieşire: suma=260 max=150. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		int[] b = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		int c = 0; int d = 0;
		for (int i = 0; i < n; ++i) {
			System.out.printf("Lungime= ");
			a[i] = input.nextInt();
			System.out.printf("Latime= ");
			b[i] = input.nextInt();
			if (d < a[i]*b[i])
				d = a[i]*b[i];
			c += a[i]*b[i];
		}
		System.out.printf("suma= %d\n",c);
		System.out.printf("max= %d\n",d);
	}
}