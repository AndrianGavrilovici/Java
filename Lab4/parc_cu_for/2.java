/* 1) Să se afişeze elementele unui vector până la prima valoare nulă. Dacă nu există nici un 0, se vor afişa toate numerele şi mesajul "Nici un element nul". Exemplu: Date de intrare: numar elemente=5, numere 3 6 8 0 2 3 Date de ieşire 3 6 8. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("numar elemente= ");
		int n = input.nextInt();
		for (int i = 0; i < n; ++i) {
			System.out.printf("a[%d]=",i);
			a[i] = input.nextInt();
		}
		for (int i = 0; i < n; ++i) {
			if (a[i] != 0){
				System.out.printf("%d\n",a[i]);
			} else break;
		}
	}
}