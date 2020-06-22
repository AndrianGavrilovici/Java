/* 1) Să se afişeze suma elementelor de pe coloana k a unei matrici cu m linii şi n coloane, k≤n. Exemplu: Date de intrare: m=2 n=4 k=1 matrice 4 3 6 8
		7 4 9 0
Date de ieşire: s=11.  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k,s=0;
		int[][] a = new int[125][125];
		System.out.printf("m= ");
		int m = input.nextInt();
		System.out.printf("n= ");
		int n = input.nextInt();
		do {
			System.out.printf("k= ");
			k = input.nextInt();
		}while(k>n);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				System.out.printf("a[%d][%d]= ",i,j);
				a[i][j] = input.nextInt();
			}
		for(int i=0;i<m;i++)
			s+=a[i][k-1];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.printf("%-5d",a[i][j]);
			System.out.println();
		}
		System.out.printf("s=%d\n",s);
	}
}