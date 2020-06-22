/* 4) Definim operaţia de compactare a unui tablou ca fiind eliminarea zerourilor. Dacă întâlnim un element nul toate elementele situate la dreapta sa vor veni cu o poziţie mai in faţă, în locul său. Se dă un tablou cu n elemente intregi. Compactaţi-l. Exemplu: Date de intrare: n=4 numere: 9 0 0 5 Date de ieşire: 9 5 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=",i);
			a[i] = input.nextInt();
		}
		System.out.printf("Tabloul fara zerouri este:\n");
		int p=n;
		for(int i=0;i<n;i++)
			if(a[i]==0)p--;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(a[i]==0){
					int t=a[i+j];
					a[i+j]=a[i];
					a[i]=t;
				}
		for(int i=0;i<p;i++)
			System.out.printf("a[%d]=%d\n",i,a[i]);
	}
}