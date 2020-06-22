/* 3) N numere naturale introduse de la tastatură să se afişeze astfel: numerele pare în ordine crescătoare şi cele impare în ordine descrescătoare.  Exemplu: pentru n=7 şi şirul 2 5 3 1 8 5 4 se va afişa 2 1 3 5 4 5 8. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[20];
		System.out.printf("n=");
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf("a[%d]=",i);
			a[i] = input.nextInt();
		}
		System.out.printf("Tabloul dat este:\n");
		for(int i=0;i<n;i++)
			System.out.printf("%-5d",a[i]);
		System.out.printf("\n");
		for(int k=0;k<n;k++)
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if(a[j]%2==0 && a[j] > a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
		for(int k=0;k<n;k++)
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if (a[j]%2!=0 && a[j] < a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}	
		
		System.out.printf("Tabloul ordonat este:\n");
		for(int i=0;i<n;i++)
			System.out.printf("%-5d",a[i]);
		System.out.printf("\n");
	}
}