import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Tipul figurii= ");
		String tip = input.nextLine();
		
		if(tip.equals("C") || tip.equals("c")){
		    System.out.print("raza= ");
		    double raza = input.nextDouble();
		    double aria = 3.14*(raza*raza);
		    System.out.print("aria = " + aria);
		}else if (tip.equals("P") || tip.equals("p")) {
		    System.out.print("lungimea laturii = ");
		    double lun = input.nextDouble();
		    System.out.print("aria = " + (lun*lun));
		}else if (tip.equals("T") || tip.equals("t")) {
		    System.out.print("lungimea laturii = ");
		    double lun = input.nextDouble();
		    System.out.print("inaltimea laturii = ");
		    double inal = input.nextDouble();
		    System.out.print("aria = " + (lun*inal)/2);
		}
		
		
	}
}
