/* 3) Se introduc n numere în ordine crescătoare şi un număr k. Să se insereze acest număr în şirul dat astfel încât să rămână sortat crescător. Exemplu: Date de intrare: n=4 k=100 numere: 90 95 110 120 Date de ieşire: 90 95 100 110 120. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[125];
		System.out.printf("n= ");
		int n = input.nextInt();
		System.out.printf("k= ");
		int k = input.nextInt();
		++n;
		for(int i=1;i<n;i++){
			System.out.printf("a[%d]= ",i-1);
			a[i] = input.nextInt();
		}
		a[0]=k;
		System.out.printf("Elementele sortate cu nr inserat %d:\n",k);
		for(int i=0;i<n;i++)
			for(int j=n-1;j>i;j--)
				if(a[j-1]>a[j]){
					int t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
		for(int i=0;i<n;i++)
			System.out.printf("%-5d",a[i]);
		System.out.printf("\n");
	}
}