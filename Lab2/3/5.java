/* 5) La un concurs se dau ca premii primilor 100 de concurenţi, tricouri de culoare albă, roşie, albastră şi neagră, în această secvenţă. Ionel este pe locul x. Ce culoare va avea tricoul pe care-l va primi? Exemplu : date de intrare : x=38 date de ieşire : rosie. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("x= ");
    	int x = input.nextInt();
    	if (x <= 100)
		{
			String str = (x%4==0)?"Neagra":(x%4==1)?"Alba":(x%4==2)?"Rosie":(x%4==3)?"Albastra":"";
			System.out.println(str);			
		} else System.out.println("Dmn nu sunteti in primii 100 de concurenti");
	}
}