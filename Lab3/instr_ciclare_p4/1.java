/* 2) Un lift coboară de la etajul a la etajul b. Afişaţi toate etajele pe care le parcurge. Exemplu : Date de intrare 8 3 Date de ieşire 8 7 6 5 4 3. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.printf("Introduceti etajul a: ");
		a = input.nextInt();
		System.out.printf("Introduceti etajul b: ");
		b = input.nextInt();
		for (int i = a; i >= b; --i)
			System.out.printf("%d\n", i);
	}
}