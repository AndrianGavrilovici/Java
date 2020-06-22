/* 4) Se citesc numere de la tastatură până la introducerea unui număr impar divizibil cu 3. Să se afişeze suma tuturor numerelor pare introduse. Exemplu: Date de intrare 7 4 6 2 1 9 Date de ieşire 12.  */
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
			if (n % 2 == 0)
			{
				s += n;
			}
		} while (!((n % 2 != 0) && (n % 3 == 0)));
		System.out.println("Suma este " + s);
	}
}