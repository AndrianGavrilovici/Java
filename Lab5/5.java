/* 5) Se dă un tablou cu m linii şi n coloane. Se cere să se afişeze suma componentelor de pe marginea tabloului.
Exemplu: Date de intrare: m=3 n=4 matrice 6 4 1 0 Date de ieşire : s=32.
										  1 5 3 3
										  0 8 2 7 */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] a = new int[125][125];
		int s=0;
		System.out.printf("m= ");
		int m = input.nextInt();
		System.out.printf("n= ");
		int n = input.nextInt();
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				System.out.printf("a[%d][%d]= ",i,j);
				a[i][j] = input.nextInt();
			}
		for(int i=0;i<1;i++)
			for(int j=0;j<n;j++)s+=a[i][j];
		for(int i=1;i<m-1;i++)
			for(int j=0;j<(n+1)-n;j++)s+=a[i][j];
		for(int i=1;i<m-1;i++)
			for(int j=n-1;j<n;j++)s+=a[i][j];
		for(int i=m-1;i>m-2;i--)
			for(int j=0;j<n;j++)s+=a[i][j];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.printf("%-4d",a[i][j]);
			System.out.printf("\n");
		}
		System.out.printf("Suma de pe marginea tabloului este:%d\n",s);
	}
}