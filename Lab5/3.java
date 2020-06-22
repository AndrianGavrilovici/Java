/* 3) Se dă o matrice pătratică cu dimensiunea n,n. Afişaţi suma elementelor de pe diagonala principală şi de pe diagonala secundară. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] a = new int[125][125];
		int p=0,s=0;
		System.out.printf("n= ");
		int n = input.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				System.out.printf("a[%d][%d]= ",i,j);
				a[i][j] = input.nextInt();
			}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.printf("%-4d",a[i][j]);
			System.out.printf("\n");
		}
		for(int i=0;i<n;i++)p+=a[i][i];
		for(int i=0;i<n;i++)s+=a[i][(n-1)-i];
		System.out.printf("Suma pe diagonala principala este %d\n",p);
		System.out.printf("Suma pe diagonala secundara este %d\n",s);
	}
}