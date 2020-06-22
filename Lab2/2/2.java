/* 2) Se introduc trei date de forma număr ordine pacient, valoare glicemie. Afişaţi numărul de ordine al pacienţilor cu glicemia mai mare decât 100. Exemplu : Date de intrare nr 6 glicemie 90 nr 10 glicemie 107 nr 21 glicemie 110 Date de ieşire 10 21 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("nr1= ");
    	int nr1 = input.nextInt();
        System.out.print("glicemie1= ");
        int gl1 = input.nextInt();
        System.out.print("nr2= ");
    	int nr2 = input.nextInt();
        System.out.print("glicemie2= ");
        int gl2 = input.nextInt();
        System.out.print("nr3= ");
    	int nr3 = input.nextInt();
        System.out.print("glicemie3= ");
        int gl3 = input.nextInt();
		System.out.println((gl1>100?nr1:"")+(gl2>100?" "+ nr2:"")+(gl3>100?" "+nr3:""));
	}
}