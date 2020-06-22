/* 4) Ducând cele două diagonale într-o matrice pătratică, se obţin patru zone triunghiulare. Afişaţi suma componentelor din interiorul fiecărei zone. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] a = new int[125][125];
		System.out.printf("n= ");
		int n = input.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				System.out.printf("a[%d][%d]=",i,j);
				a[i][j] = input.nextInt();
			}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.printf("%-4d",a[i][j]);
			System.out.printf("\n");
		}
		int s=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				a[i][i]=0;
				a[i][(n-1)-i]=0;
				s+=a[i][j];
			}
		System.out.printf("Matricea fara diagonale este:\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.printf("%-4d",a[i][j]);
			System.out.printf("\n");
		}
		System.out.printf("Suma zonelor:%d\n",s);
	}
}