/* 9) Se introduc de la tastatură trei cifre. Afişaţi pe aceeaşi linie 5 numere formate cu aceste cifre luate o singură
dată. Exemplu : date de intrare : 3 4 2 Date de ieşire : 324 342 243 234 432. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Dati 3 cifre: ");
    	int n1 = input.nextInt();
    	int n2 = input.nextInt();
    	int n3 = input.nextInt();
	    System.out.print(n1+""+n3+""+n2+" ");
		System.out.print(n1+""+n2+""+n3+" ");
	    System.out.print(n3+""+n2+""+n1+" ");
	    System.out.print(n3+""+n1+""+n2+" ");
	    System.out.println(n2+""+n1+""+n3);
	}
}