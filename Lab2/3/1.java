/* 1) Se dau trei numere. Să se afişeze aceste numere unul sub altul, afişând în dreptul fiecăruia unul dintre cuvintele PAR sau IMPAR. Exemplu : Date de intrare : 45 3 24 Date de ieşire : 45 impar 3 impar 24 par. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n1= ");
    	int n1 = input.nextInt();
        System.out.print("n2= ");
        int n2 = input.nextInt();
        System.out.print("n3= ");
        int n3 = input.nextInt();
        System.out.println((n1%2==0)?n1+ " par":n1+ " impar");
        System.out.println((n2%2==0)?n2+ " par":n2+ " impar");
        System.out.println((n3%2==0)?n3+ " par":n3+ " impar");
	}
}