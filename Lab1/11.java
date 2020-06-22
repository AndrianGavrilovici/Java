/* 11) Afişaţi tabla înmulţirii cu numărul n. Exemplu: pentru n=5, se va afişa pe verticală 1x5=5 2x5=10 3x5=15 4x5=20 5x5=25 6x5=30 7x5=35 8x5=40 9x5=45 10x5=50. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n= ");
    	int n = input.nextInt();
	    for(int i = 1; i <= 10; i++) {
	    	System.out.println(i+ " * "+ n+ " = "+ (n*i));
	    }
	}
}