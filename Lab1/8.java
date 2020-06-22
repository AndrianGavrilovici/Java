/* 8) Maria vrea să verifice dacă greutatea şi înălţimea ei corespund vârstei pe care o are. Ea a găsit într-o carte
următoarele formule de calcul ale greutăţii şi înălţimii unui copil, v fiind vârsta : greutate=2*v+8 (în kg),
înălţime=5*v+80 (în cm). Realizaţi un program care să citească vârsta unui copil şi să afişeze greutatea şi
înălţimea ideală, folosind aceste formule.  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Introduceti varsta: ");
    	int v = input.nextInt();
		int g=2*v+8;
		System.out.println("Greutatea ideala este: "+g+" kg");
		int h=5*v+80;
		System.out.println("Inaltimea ideala este: "+h+" cm.");
	}
}