/* 2) Se introduc punctajele realizate de m concurenţi la n probe sub forma unei matrici cu m linii şi n coloane. Afişaţi punctajul total realizat de fiecare concurent. Exemplu: Date de intrare: m=3 n=2 punctaj concurent 1: 7 9 punctaj concurent 2: 10 8 punctaj concurent 3: 9 9 Date de iesire: concurent1 16 concurent2 18 concurent3 18. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] a = new int[50][50];
		System.out.printf("m= ");
		int m = input.nextInt();
		System.out.printf("n= ");
		int n = input.nextInt();
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				System.out.printf("concurent %d= ",i+1);
				a[i][j] = input.nextInt();
			}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.printf("%-4d",a[i][j]);
			System.out.printf("\n");
		}
		int s = 0;
		for(int i=0;i<m;i++){
			s = 0;
			for(int j=0;j<n;j++)
				s += a[i][j];
			System.out.printf("concurent %d=%d\n",i+1,s);
		}
	}
}