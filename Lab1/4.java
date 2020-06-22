/* Într-un autobuz care pleacă în excursie sunt 7 copii. De la încă două şcoli urcă alţi copii, numărul acestora
citindu-se de la tastatura. Câţi copii au plecat în excursie? Exemplu: Date de intrare: 15 20 Date de ieşire: 42
copii. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	int initial = 7;
    	System.out.print("Copii din scoala 1: ");
    	int n1 = input.nextInt();
    	System.out.print("Copii din scoala 2: ");
    	int n2 = input.nextInt();
        System.out.print("Nr. total de copii care a plecat in excursie: "+ (initial+n1+n2));    	
	}
}