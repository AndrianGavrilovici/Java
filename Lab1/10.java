/* 10) Date trei numere, să se calculeze toate sumele posibile de câte două numere. Afişarea să cuprindă şi termenii sumei, nu numai valoarea ei. Exemplu: Date de intrare : 2 13 4 Date de ieşire: 2+13 =15 2+4=6 13+4=17.  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Dati 3 numere: ");
    	int n1 = input.nextInt();
    	int n2 = input.nextInt();
    	int n3 = input.nextInt();
	    System.out.println(n1+ " + "+ n2+ " = "+ (n1+n2));
	    System.out.println(n1+ " + "+ n3+ " = "+ (n1+n3));
	    System.out.println(n2+ " + "+ n3+ " = "+ (n2+n3));
	}
}