/* 9) Afişaţi câte numere au forma aaa , din n numere date. Exemplu: Date de intrare n=3 numere 123 222 434 Date de ieşire 1 nr. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		int d = 0;
		System.out.printf("Introduceti numere: \n");
		for (int i = 0; i < n; ++i) {
			System.out.printf("n(%d)=",i+1);
			a[i] = input.nextInt();
			if (a[i] % 111 == 0)
				d++;
		}
		System.out.printf("%d numar\n",d);
	}
}