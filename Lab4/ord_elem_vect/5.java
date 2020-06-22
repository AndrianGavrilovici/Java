/* 6) La un concurs participă n sportivi. Se cunosc rezultatele fiecărui sportiv. Să se afişeze cele mai bune trei rezultate, în ordine descrescătoare a performanţei. Exemplu: pentru n=5 şi rezultatele 156 187 23 97 86 se va afişa 187 156 97.  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("n= ");
		int n = input.nextInt();
		int[] a = new int[n];
		int t=0;
		System.out.printf("Introduceti rezultatele sportivilor: \n");
		for(int i=0;i<n;++i){
			System.out.printf("Sporivul [%d]= ",i+1);
			a[i] = input.nextInt();
		}
		for(int i=0;i<n;++i)
			for(int j=n-1;j>i;--j)
				if (a[j-1] < a[j]){
					t = a[j-1];
					a[j-1] = a[j];
					a[j] = t;
				}
		System.out.printf("Cele mai bune 3 rezultate sunt: \n");
		System.out.printf("%d, %d, %d", a[0], a[1], a[2]);
		System.out.println();
	}
}