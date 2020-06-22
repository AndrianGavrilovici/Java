/* 4) Un copac creşte zilnic cu 0.75 cm. La plantare avea 1 m. Să se afişeze după câte zile ajunge la înălţimea de 12 m. La ce înălţime ajunge după o lună (30 zile)?  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a;
		a = 1;
		for (int i = 1; i <= 12; ++i)
			a+=0.0075;
		System.out.println(a + " ani");
		System.out.print("Introduceti zile: ");
		int n = input.nextInt();
		a = 100;
		for (int i = 1; i <= n; ++i)
			a+=0.75;
		System.out.println("dupa "+ n +" zile copacul va ajunge "+ a + " cm");
	}
}