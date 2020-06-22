/* Se dă un număr natural n. Afişaţi un triunghi de forma
n
n+2 n+2
n+4 n+4 n+4
n+6 n+6 n+6 n+6 (CNI-etapa judeţeană, Petroşani, 2005) */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);    	
    	System.out.print("Enter an integer: ");
    	int n = input.nextInt();
    	System.out.println(n);
    	System.out.println((n+2)+" "+(n+2));
    	System.out.println((n+4)+" "+(n+4)+" "+(n+4));
    	System.out.println((n+6)+" "+(n+6)+" "+(n+6)+" "+(n+6));
	}
}
