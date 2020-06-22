/* 6) A fost odată un balaur cu 6 capete. Într-o zi Făt Frumos s-a supărat şi i-a tăiat un cap. Peste noapte i-au crescut alte 6 capete la loc. A doua zi Făt Frumos iar i-a tăiat un cap dar peste noapte balaurului i-au crescut alte 6 capete … şi tot aşa timp de n zile. În cea de a (n+1)-a zi, Făt Frumos s-a plictisit şi a plecat acasă! Scrieţi un program care citeşte de la tastatură n, numărul de zile, şi care afişează pe ecran câte capete avea balaurul după n zile. Exemplu: pentru n=3 se va afişa 15 capete. (ONI 2002 cl.a V-a) */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n= ");
		int n = input.nextInt();
		int a = 0;
		for (int i = 0; i < n; ++i)
		{
			a += 5;
		}
		System.out.println(a + " capete");
	}
}