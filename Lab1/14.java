/* 14) Să se scrie un program care citeşte un număr de ani şi calculează numărul de luni, zile şi ore corespunzătoare. Se consideră că un an are 365 zile. Exemplu: date de intrare: 2 date de ieşire: 24 luni 730 zile 17520 ore. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("nr. de ani= ");
    	int n = input.nextInt();
		int l = n * 12;
		int z = n * 365;
		int o = n * 365 * 24;
		System.out.println(l+ " luni, "+ z+ " zile, "+ o+ " ore.");
	}
}