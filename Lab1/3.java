/* Într-o tabără numărul de băieţi este cu 10 mai mare decât cel al fetelor. Dacă se citeşte de la tastatură
numărul de fete, să se spună câţi elevi sunt în tabără. Exemplu: date de intrare: 50 date de ieşire: 110. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	
    	System.out.print("Nr. de fete: ");
    	int n = input.nextInt();
        System.out.print("Nr. total de elevi: "+ (n+n+10));    	
	}
}