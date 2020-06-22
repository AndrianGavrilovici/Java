/* 11) Se introduce un număr. Să se verifice dacă este număr prim. Exemple: Date de intrare 23 date de ieşire Prim; Date de intrare 45 Date de ieşire Nu este prim */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n= ");
    	int n = input.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("Nu este prim");
		}else System.out.println("Este prim");
	}
}