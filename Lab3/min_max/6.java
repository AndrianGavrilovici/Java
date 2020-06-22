/* 6) Se citesc mediile a n elevi, ca numere reale. Să se afişeze cea mai mare şi cea mai mică medie. Să se verifice dacă sunt corigenţi. Exemplu : Date de intrare n=4 9.50 4.25 9.66 6.33 Date de ieşire max=9.66 min=4.25 1 corigent */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,k;float a,max,min;
		System.out.printf("n= ");
		n = input.nextInt();
		min = 10;
		max = 0;
		k = 0;
		for (int i = 0; i < n; ++i)
		{
			System.out.printf("Elevul %d: ",i+1);
			a = input.nextFloat();
			if (a > max) max = a;
			if (a < min) min = a;
			if (a < 5) k++;
		}
		System.out.printf("max= %.2f\n",max);
		System.out.printf("min= %.2f\n",min);
		if (k == 1) {
			System.out.printf("%d corigent\n",k);
		}else if (k == 0) {
			System.out.printf("nu-i nimeni corigent\n");
		}else System.out.printf("%d corigenti\n",k);
	}
}