/* 12) Să se afişeze primele n numere prime. Exemplu: Date de intrare n=6 Date de ieşire 2 3 5 7 11 13 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n= ");
    	int n = input.nextInt();		
		int a = 0;
		int k = 1;
		int b = 2;
		while( k <= n ) {
			a = 0;
			for (int i = 2; i < b; ++i) {
				if (b % i == 0) a += 1;
			}
			if (a == 0) {
				System.out.print(b + " ");
				k++;
			}
			b++;
		}
	}
}