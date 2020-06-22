/* 1) Se dau numerele a şi n. Să se afişeze numărul a urmat de n zerouri. Exemplu: Date de intrare a=34 n=5 Date de ieşire 3400000. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("n= ");
		int n = input.nextInt();
		System.out.print(a);
		for (int i = 1; i <= n; ++i)
		{
			System.out.print("0");
		}
		System.out.println();
	}
}