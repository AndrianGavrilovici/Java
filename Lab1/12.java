/* 12) Se introduc lungimea şi lăţimea unui dreptunghi. Să se afişeze cuvântul PERIMETRU urmat de valoarea perimetrului acelui dreptunghi. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("lungimea= ");
    	int lungimea = input.nextInt();
    	System.out.print("latimea= ");
    	int latimea = input.nextInt();
		int p=2*(lungimea+latimea);
		System.out.println("PERIMETRU: "+ p+ " cm");
	}
}