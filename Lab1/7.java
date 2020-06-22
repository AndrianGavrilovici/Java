/* Doi copii au primit acelaşi număr de mere Introducând de la tastatură numărul de mere primte, afişaţi câte
mere are fiecare copil după ce primul copil mănâncă un măr şi dă unul celuilalt copil. Exemplu : Date de
intrare : 10 Date de ieşire : primul copil 8 mere al doilea copil 11 mere. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Nr. de mere primite: ");
    	int n = input.nextInt();
        System.out.println("Primul copil are: "+ (n-2)+ " mere");
        System.out.println("A doilea copil are: "+ (n+1)+ " mere");
	}
}