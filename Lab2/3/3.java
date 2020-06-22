/* 3) Se dau două numere. Să se afişeze acele numere care se împart exact la 7. Exemplu : Date de intrare : 34 28 Date de ieşire : 28. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n1= ");
    	int n1 = input.nextInt();
        System.out.print("n2= ");
        int n2 = input.nextInt();
        System.out.println(((float)n1/7==n1/7)?n1:((float)n2/7==n2/7)?n2:"Nici unul nu se imparte exact la 7");
	}
}