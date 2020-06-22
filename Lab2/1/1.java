/* 1) Date două numere, afişaţi-l pe cel mai mic. Exemplu : Date de intrare : 44 32 Date de ieşire : 32 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n1= ");
    	int n1 = input.nextInt();
        System.out.print("n2= ");
        int n2 = input.nextInt();
        System.out.println("nr cel mai mic este: "+ ((n1<n2)?n1:n2));
	}
}