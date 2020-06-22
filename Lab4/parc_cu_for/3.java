/* 2) Se introduc n numere reprezentând punctajele obţinute la un concurs. Să se afişeze primele k punctaje mai mari decât o valoare b, necesară calificării la o etapă superioară. Dacă nu sunt suficienţi concurenţi care să fi obţinut punctaj peste b, să se afişeze şi mesajul "Candidati insuficienti". Exemplu: Date de intrare n=3 punctaje: 45 23 78 k=2 b=50 Date de ieşire 78. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		for (int i = 0; i < n; ++i) {
			System.out.printf("a[%d]=",i);
			a[i] = input.nextInt();
		}
		System.out.printf("k= ");
		int k = input.nextInt();
		System.out.printf("b= ");
		int b = input.nextInt();
		System.out.printf("punctaje: ");
		int c = 0;
		for (int i = 0; i < n; ++i)
			if (a[i] >= b) {
				c++;
				System.out.printf("%-3d",a[i]);
			}
		System.out.println();
		if (k > c)
			System.out.println("Candidati insuficienti");
	}
}