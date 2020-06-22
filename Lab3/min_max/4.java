/* 4) Se introduc datele de naştere a n copii, sub forma an, număr lună, zi. Să se afişeze câţi copii sunt născuţi pe 1 iunie şi câţi copii sunt născuţi în 1994, 1995 şi 1996. Exemplu: Date de intrare n=3 an=1994 luna=12 zi=3 an=1990 luna=6 zi=1 an=1995 luna=6 zi=1 Date de ieşire 2 copii născuţi la 1 iunie 2 copii născuţi în 1994 1995 1996. 
 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,a,l,z,c,d;
		System.out.printf("n= ");
		n = input.nextInt();
		c = 0;
		d = 0;
		for (int i = 0; i < n; ++i)
		{
			System.out.printf("Copilul %d\n",i+1);
			System.out.printf("an= ");
			a = input.nextInt();
			System.out.printf("luna= ");
			l = input.nextInt();
			System.out.printf("zi= ");
			z = input.nextInt();
			if (z == 1 && l == 6) c++;
			if (a == 1994 || a == 1995 || a == 1996) d++;
		}
		System.out.printf("%d copii nascuti la 1 iunie\n",c);
		System.out.printf("%d copii nascuti in 1994 1995 1996\n",d);
	}
}