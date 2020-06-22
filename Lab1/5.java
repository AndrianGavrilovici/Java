/* Un brăduţ este împodobit cu globuleţe albe, roşii şi albastre. Numărul globuleţelor albe se citeşte de la
tastatură. Câte globuleţe are brăduţul, ştiind că numărul de globuleţe roşii este cu 3 mai mare decât numărul
de globuleţe albe, iar globuleţele albastre sunt cu 2 mai puţine decât totalul celor albe şi roşii. Exemplu: Date
de intrare: 12 Date de ieşire: 52. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Globulete albe: ");
    	int g_albe = input.nextInt();
    	int g_rosii = g_albe + 3;
    	System.out.println("Globulete rosii sunt: "+ g_rosii);
    	int g_albastre = g_albe + g_rosii - 2;
    	System.out.println("Globulete albastre sunt: "+ g_albastre);
    	System.out.println("In total globulete sunt: "+ (g_albe+g_rosii+g_albastre));
	}
}