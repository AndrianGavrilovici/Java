/* 2) Se dă un vector cu n componente întregi. Se cere să se afişeze primele k componente în ordine crescătoare iar celelalte în ordine descrescătoare. Exemplu: n=7 k=3 şirul 23 12 18 4 0 23 5 se va afişa 12 18 23 23 5 4 0 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[20];
		int[] b = new int[20];
		System.out.printf("n= ");
		int n = input.nextInt();
		System.out.printf("k= ");
		int k = input.nextInt();
		for (int i = 0; i < n; ++i) {
			System.out.printf("a[%d]= ",i);
			a[i] = input.nextInt();
		}
		for (int i = 0; i < k; ++i)
			for (int j = k-1; j > i; --j)
				if (a[j-1] > a[j]) {
	            	int t = a[j-1];
	            	a[j-1] = a[j];
					a[j] = t;
	            }
		for (int i = k+1; i < n; ++i)
			for (int j = n-1; j > k; --j)
				if (a[j-1] < a[j]) {
	            	int t = a[j-1];
	            	a[j-1] = a[j];
					a[j] = t;
	            }
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ",a[i] );
		System.out.printf("\n");
	}
}