/* 2) Se citesc pe rând temperaturile medii ale fiecărei luni a unui an, ca numere întregi. Să se afişeze cu două zecimale media anuală a temperaturilor pozitive şi a celor negative. Exemplu: Date de intrare -5 -3 1 8 12 17 20 21 18 10 6 -2 Date de ieşire medie_poz=13.66 medie_neg=-3.33. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,d,e;float a,c,l,k;
		a = 0;
		d = 0;
		k = 0;
		e = 0;
		System.out.println("Introduceti temperatura medie a lunelor");
		for (int i = 0; i < 12; ++i)
		{
			System.out.print("t("+(i+1)+")= ");
			n = input.nextInt();
			if (n > 0) {
				d++;
				a += n;
			}
			if (n < 0) {
				e++;
				k += n;
			}
		}
		c = a/d;
		l = k/e;
		System.out.println("medie_poz= " + c);
		System.out.println("medie_neg= " + l);
	}
}