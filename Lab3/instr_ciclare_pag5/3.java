/* 5) Pentru a o elibera pe Ileana Cosânzeana, Făt-Frumos trebuie să parcurgă x km. El merge zilnic a km, dar Zâna-cea-Rea îl duce în fiecare noapte cu b km înapoi, b<a. După câte zile o eliberează? Exemplu: Date de intrare x=10 a=4 b=1 Date de ieşire 3 zile. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,a,b,c,i;
		System.out.print("x= ");
		x = input.nextInt();
		System.out.print("a= ");
		a = input.nextInt();
		do {
			System.out.print("b= ");
			b = input.nextInt();
		}while( b > a );
		c = 0;
		i = 0;
		do {
			i += a;
			if (i<x) i -= b;
			c++;
		} while (i < x);
		System.out.println(c + " zile");
	}
}