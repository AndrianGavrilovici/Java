/* 1) Să se insereze cifra 0 pe prima poziţie a unui vector dat, fără a utiliza un alt vector. Exemplu: Date de intrare: n=4 numere: 5 3 7 8 Date de ieşire: 0 5 3 7 8 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("n= ");
		int n = input.nextInt();
		int[] a = new int[255];
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]= ",i);
			a[i] = input.nextInt();
		}
		++n;
		for(int i=n;i>=0;i--)
			a[i+1]=a[i];
		a[0]=0;
		for(int i=0;i<n;i++)
			System.out.printf("%-4d",a[i]);
		System.out.printf("\n");
	}
}