/* 5) Să se genereze primii n termeni ai şirului 1,1,2,2,2,3,3,3,3,4,4,4,4,4,…. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("a= ");
		int a = input.nextInt();
		for (int i = 1; i < a; ++i)
			for (int j = 1; j < i+2; ++j)		
				System.out.printf(" %d ", i);
		
		System.out.printf("\n");
	}
}