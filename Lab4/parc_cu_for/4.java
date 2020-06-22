/* 8) Se introduc n numere egale cu 0, 1 sau 2. Să se scrie un program care să determine pe ce poziţie apare primul 0, de câte ori apare fiecare cifră şi care este cifra folosită cel mai puţin. Exemplu: Date de intrare n=7 numere: 1 1 0 2 1 0 1 Date de ieşire: pozitie primul zero 3, cifra 0 apare de 2 ori cifra 1 apare de 4 ori cifra 2 apare de 1 ori, cel mai putin: 2. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		int b = 0; int c = 0;
		int d = 0;
		for (int i = 0; i < n; ++i)
			do {
				System.out.printf("a[%d]= ",i);
				a[i] = input.nextInt();
			} while (a[i] != 0 && a[i] != 1 && a[i] != 2);
		for (int i = 0; i < n; ++i) {
			if (a[i] == 0) {
				b++;
				if (b == 1)
					System.out.printf("pozitie primul zero %d\n",i+1 );
			}
			if (a[i] == 1) c++;
			if (a[i] == 2) d++;
		}
		System.out.printf("cifra 0 apare de %d ori\n",b);
		System.out.printf("cifra 1 apare de %d ori\n",c);
		System.out.printf("cifra 2 apare de %d ori\n",d);
		System.out.printf("cel putin %d",((b<c&&b<d)?0:(c<d)?1:2));
	}
}