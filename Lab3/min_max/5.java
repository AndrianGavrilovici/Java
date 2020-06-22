/* 5) Se citesc de la tastatură numere întregi pozitive atâta timp cât suma lor nu depăşeşte 1000. Să se scrie un program care să afişeze cea mai mică şi cea mai mare valoare a acestor numere. Exemplu: 550 345 100 45 Date de ieşire max=550 min=100. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0,a = 0,s = 0;
		int c = 1000;
		for (int i = 0; s < 1000; ++i) {
			System.out.printf("n= ");
			n = input.nextInt();
			if (n > 0 && s < 1000) {
				s += n;
				if (s <= 1000) {
					if (n > a) a = n;
					if (n < c) c = n;
				}	
			}
			if (n < 0)
				System.out.printf("Nr.negativ si nu se citeste\n");
		}
		if (n <= 1000) {
			System.out.printf("max=%d\n",a);
			System.out.printf("min=%d\n",c);
		} else System.out.printf("n > 1000 !!\n");
	}
}