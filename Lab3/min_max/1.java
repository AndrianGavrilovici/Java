/* 1) Se citesc pe rând 4 numere întregi. Să se numere câte dintre ele au restul 7 la împărţirea cu 13. Să se afişeze aceste numere şi produsul celorlalte numere. Exemplu: Date de intrare 20 15 30 46 Date de ieşire Numere: 20 46 Total: 2 Produs: 450 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] p = new int[4];
		int c = 1;
		int k = 0;
		for (int i = 0; i < 4; i++){
			System.out.print("n= ");
			int n = input.nextInt();	
			if (n % 13 == 7)
				p[k++]=n;
			if (n % 13 != 7)
				c *= n;
		}
		System.out.print("Numere: ");
		for (int i = 0; i < k; i++)
			System.out.print(p[i] + "  ");
		System.out.println("\nTotal: "+k);
		System.out.println("Produs: "+c);
	}
}