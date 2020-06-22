/* 5) Cunoscând numele şi înălţimea a n elevi, n<=100, să se afişeze numele acestora în ordinea descrescătoare a înălţimii. Exemplu: Date de intrare: n=3 nume: Ion inaltime: 120 nume:Ana inaltime:114 nume: Dan inaltime 130 Date de ieşire: Dan Ion Ana  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] height = new int[100];
		String[] name = new String[100];
		System.out.printf("n= ");
		int n = input.nextInt();
		for (int i = 0; i < n; ++i)
		{
			System.out.printf("Nume %d: ",i+1);
			name[i] = input.next();
			System.out.printf("Inaltime: ");
			height[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++)
			for (int j = n-1; j > i; j--)
				if (height[j-1] < height[j])
	            {
	            	int t = height[j-1];
	            	height[j-1] = height[j];
					height[j] = t;
					String c = name[j-1];
					name[j-1] = name[j];
					name[j] = c;
	            }
		for (int i = 0; i < n; ++i)
			System.out.printf("%s ",name[i]);
		System.out.printf("\n");
	}
}