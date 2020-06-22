/* 2) Se introduc n numere în calculator. Să se rearanjeze elementele din şir astfel încât primul element al şirului dat să apară pe ultima poziţie. Exemplu: Date de intrare: n=3 numere: 1 2 3 Date de ieşire: 2 3 1. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("n= ");
		int n = input.nextInt();
		int[] a = new int[n+1];
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]= ",i);
			a[i] = input.nextInt();
		}
		a[n]=a[0];
		for(int i=0;i<n;i++)
			a[i]=a[i+1];
		for(int i=0;i<n;i++)
			System.out.printf("%-4d",a[i]);
		System.out.printf("\n");
	}
}