/* 4) "Ma iubeste un pic, mult, cu pasiune, la nebunie, de loc, un pic,…". Rupând petalele unei margarete cu x petale, el (ea) mă iubeşte …. Exemplu: Date de intrare: x=10 Date de ieşire: … de loc. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("x= ");
    	int x = input.nextInt();
    	System.out.println("Ma iubeste " + ((x%5==0)?"de loc":(x%5==1)?"un pic":(x%5==2)?"mult":(x%5==3)?"cu pasiune":"la nebunie"));
	}
}