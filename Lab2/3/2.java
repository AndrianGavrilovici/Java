/* 2) Se dau două numere nenule. Să se verifice dacă primul se împarte exact la al doilea. Exemplu : Date de intrare : 45 7 Date de ieşire : Nu. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n1= ");
    	int n1 = input.nextInt();
        System.out.print("n2= ");
        int n2 = input.nextInt();
        System.out.println(((float)n1/(float)n2==n1/n2)?"Da":"Nu");
	}
}