/* 7) Se dă un număr. Să se scrie, dacă se poate, ca sumă de două numere impare. Exemple : date de intrare 24 Date de ieşire 24=1+23 24=3+21 24=5+19 24=7+17 24=9+15 24=11+13 ; Date de intrare 33 Date de ieşire Nu se poate. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("n= ");
		int a = input.nextInt();
		if (a % 2 == 0) {
			for (int i = 1; i < a/2; i+=2)
				System.out.printf("%d=%d+%d\n",a,i,a-i);	
		} else System.out.printf("Nu se poate\n");
	}
}