/* 6) Să se afişeze primii n termeni ai şirului lui Fibonacci : 0,1,1,2,3,5,8,13,21…. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("n= ");
		int n = input.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 0; i < n; ++i)
		{
			System.out.printf(" %d ",a);
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}
}