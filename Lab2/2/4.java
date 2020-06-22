/* 4) Se introduc două numere. Dacă al doilea număr este diferit de 0, să se afişeze câtul dintre primul şi al doilea, iar dacă este nul, să se afişeze mesajul "Impartire imposibila". Exemple : Date de intrare 10 3 Date de ieşire 3.33 Date de intrare 45 0 date de ieşire Impartire imposibila. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n1= ");
    	int n1 = input.nextInt();
        System.out.print("n2= ");
    	int n2 = input.nextInt();
        if(n2 == 0){
            System.out.println("Impartire imposibila");
        } else System.out.println(((float)n1/(float)n2));
	}
}