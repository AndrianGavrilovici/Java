/* Să se afişeze triunghiul
*
**
***
Să se introducă un caracter de la tastatură şi să se afişeze un triunghi asemănător folosind caracterul
introdus. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an char: ");
    	char key = input.next().charAt(0);
    	System.out.print(key+"\n"+key+key+"\n"+key+key+key);
	}
}
