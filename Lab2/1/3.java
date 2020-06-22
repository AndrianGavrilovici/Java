/* 3) Se introduc punctajele a doi sportivi. Afişaţi-le în ordine descrescătoare. Exemplu: Date de intrare 100 134 Date de ieşire: 134 puncte 100 puncte. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("punctaj 1= ");
    	int n1 = input.nextInt();
        System.out.print("punctaj 2= ");
        int n2 = input.nextInt();
        System.out.println(((n1>n2)?n1+" puncte "+n2:n2+ " puncte "+ n1)+ " puncte");
	}
}