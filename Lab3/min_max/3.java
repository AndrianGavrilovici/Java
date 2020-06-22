/* 3) Se citesc numere naturale strict pozitive până la întâlnirea numărului 0. Să se numere câte dintre ele sunt pare, presupunând că cel puţin primul element este nenul. Exemplu: Date de intrare 4 3 6 5 7 7 0 Date de ieşire 2 numere pare. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,c;
		c = 0;
		do
		{
			System.out.printf("n= ");
			n = input.nextInt();
			if (n % 2 == 0 && n > 0)
			{
				c++;
			}
			if (n < 0)
			{
				System.out.printf("Nr.negativ si nu se citeste\n");
			}
		} while (n != 0);
		System.out.printf("%d numere pare\n",c );
	}
}