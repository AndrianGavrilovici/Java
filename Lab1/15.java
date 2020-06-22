/* 15) Măriuca ţine evidenţa iepurilor din crescătorie. Ea îşi notează câţi iepuri sunt la începutul fiecărei luni, câţi au murit şi câţi s-au născut în cursul fiecăei luni. Puteţi să realizaţi un program care, primind aceste date, să afişeze la sfârşitul fiecărei luni câţi iepuri sunt în crescătorie? Exemplu : Date de intrare : nr. Iepuri la început de luna 10 nr. iepuri morti 2 nr. iepuri nascuti 6 Date de ieşire : 14 iepuri. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Nr. epuri la inceput de luna= ");
    	int in = input.nextInt();
    	System.out.print("Nr. epuri morti= ");
    	int morti = input.nextInt();
    	System.out.print("Nr. epuri nascuti= ");
    	int nascuti = input.nextInt();
    	System.out.println("Sunt: " + (in-morti+nascuti)+ " iepuri");
	}
}