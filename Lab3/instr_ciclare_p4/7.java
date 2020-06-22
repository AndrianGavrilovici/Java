/* 10) Să se afişeze toţi divizorii unui număr natural dat. Exemplu : Date de intrare 12 Date de ieşire 1 2 3 4 6 12. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("a= ");
		int a = input.nextInt();
		for (int i = 1; i <= a; ++i)
			if (a % i == 0)		
				System.out.printf("%d\n",i );	
	}
}