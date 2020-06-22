/* 4) Prin ordonarea elementelor unui vector format din n caractere, să se afişeze de câte ori apare fiecare caracter. Exemplu: Date de intrare: n=4 elemente: a 4 g a Date de ieşire: a apare de 2 ori g apare de 1 ori 4 apare de 1 ori. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] a = new char[255];
		System.out.printf("n=");
		int n = input.nextInt();
		System.out.printf("Elemente: \n");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]= ",i);
			a[i] = input.next().charAt(0);
		}
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if(a[j]>a[j+1]){
					char t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
		System.out.printf("Elementele sortate sunt:\n");
		for(int i=0;i<n;++i)
			System.out.printf("%-3c",a[i]);
		System.out.printf("\n\n");
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<=n;j++){
				if (a[i] == a[j]){
					count++;
				}else {
					System.out.printf("%c apare de %d ori\n",a[i],count+1);
					i+=count;
					count=0;
					break;
				}
			}
		}
	}
}