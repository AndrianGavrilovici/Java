/* 3) Se introduc succesiv numere nenule până la introducerea numărului 0. Să se afişeze suma tuturor numerelor introduse. Exemplu: Date de intrare 3 5 4 2 0 Date de ieşire 14. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,s;
		s = 0;
		do
		{
			System.out.print("n=");
			n = input.nextInt();
			s += n;
		} while (na != 0);
		System.out.println("Suma este " + s);
	}
}