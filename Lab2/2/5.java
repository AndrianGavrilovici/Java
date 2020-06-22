/* 5) Un lift pentru copii acceptă o greutate de maxim 100 kg. Introducând în calculator greutăţile a doi copii, specificaţi prin afişarea unui mesaj corespunzător, dacă POT INTRA AMBII COPII sau INTRA PE RAND. Exemple : Date de intrare : greutati copii 87 50 Date de ieşire : Intra pe rand Date de intrare 45 52 Date de ieşire Pot intra ambii copii. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Introduceti greutatea copilului 1: ");
    	int a = input.nextInt();
        System.out.print("Introduceti greutatea copilului 2: ");
    	int b = input.nextInt();
        if (a + b <= 100)
        {
            System.out.println("Pot intra ambii");
        }else if (a + b > 100)
        {
            System.out.println("Intra pe rand");
        }
	}
}