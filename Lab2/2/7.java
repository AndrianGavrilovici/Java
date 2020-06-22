/* 7) Să se scrie un program care determină greutatea ideală a unei persoane cunoscând înălţimea, vârsta şi sexul persoanei. Formulele de calcul sunt: Gmasculin = 50 + 0.75 * (inaltime - 150) + (varsta - 20) / 4, Gfeminin = Gmasculin – 10, unde înălţimea este exprimată în cm şi vârsta în ani. Sexul se citeşte sub forma unui caracter, f sau m. Exemplu: Date de intrare: inaltime= 160 varsta=21 sex=f Date de ieşire: greutate= 47.75 kg. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inaltimea (in cm): ");
		double i = input.nextDouble();
		System.out.print("Varsta (in ani): ");
		double v = input.nextDouble();
		System.out.print("Sex (m-masculin;f-femenin): ");
    	char sx = input.next().charAt(0);
		double gm = 50 + 0.75 * (i - 150) + (v - 20) / 4;
		double gf = gm - 10;
		if (sx == 'm')
		{
			System.out.println("Greutatea ideala este: " + gm + " kg");
		} else if (sx == 'f')
		{
			System.out.println("Greutatea ideala este: " + gf + " kg");
		}
	}
}