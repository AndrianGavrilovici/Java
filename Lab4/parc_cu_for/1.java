/* 5) Introduceţi n numere într-un vector şi un număr d. Afişaţi acele numere din şirul dat care sunt divizibile cu d. Exemplu: date de intrare n=5 numere: 5 7 10 23 15 d=5 Date de ieşire 5 10 15. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		System.out.printf("d= ");
		int d = input.nextInt();
		for (int i = 0; i < n; ++i) {
			System.out.printf("a[%d]=",i);
			a[i] = input.nextInt();
		}
		System.out.printf("Numerele divizibile cu %d: \n",d);
		for (int i = 0; i < n; ++i)
			if (a[i] % d == 0)
				System.out.printf("%d\n",a[i] );
	}
}