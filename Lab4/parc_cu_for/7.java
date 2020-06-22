/* 16) Moş Crăciun soseşte în mijlocul copiilor oferind fiecărui copil un cadou cu o anumită valoare (numărul copiilor se citeşte de la tastatură, precum şi valorile cadourilor, în lei). Să se spună:
-cât a cheltuit Moşul pentru cumpărarea cadourilor (în moşi, 1 leu=6 moşi)
-dacă Moşul are sau nu un copil preferat, adică dacă există un copil al cărui cadou să aibă valoarea mai mare decât suma valorilor cadourilor tuturor celorlalţi copii. Dacă există, afişaţi DA, urmat de indicele copilului, în caz contrar afişaţi NU. Exemplu: dacă n=5 valori cadouri: 10 50 6 5 20, se va afişa: Mosul a cheltuit 546 mosi DA 2 (InfoStar, Aiud 1995 clasa a VI-a) */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		int m = 0, l = 0, k = 0;
		for (int i = 0; i < n; ++i) {
			System.out.printf("valoarea cadoului %d:",i+1);
			a[i] = input.nextInt();
			k += a[i]*6;
			if (a[i] > m) {
				m = a[i];
				l = i+1;
			}
		}
		System.out.printf("Mosul a cheltuit %d mosi\n",k );
		if (l == 1) {
			System.out.printf("DA copilul %d\n",l);
		}else System.out.printf("DA copilul al %d-lea\n",l);
	}
}