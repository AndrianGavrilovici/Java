/* 6) Ionel are voie să se uite la TV 20 de ore pe săptămână. Se introduc numărul de ore cât se uită la TV în fiecare zi din săptămână. Să se verifice dacă va fi pedepsit sau nu. Exemplu: Date de intrare: 3 4 2 2 5 6 1 Date de ieşire: Va fi pedepsit. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int c = 0;
        for (int i = 1; i <= 7; ++i)
        {
            System.out.print("Orele de ziua "+ i+ ": ");
            c += input.nextInt();
        }
        if (c > 20)
        {
            System.out.println("Total a privit "+ c+ " ore");
            System.out.println("Da, va fi pedepsit!");
        } else if (c <= 20)
        {
            System.out.println("Total a privit "+ c+  "ore");
            System.out.println("Nu, nu va fi pedepsit!");
        }
	}
}