/* 2) Se introduc vârstele a doi copii. Afişaţi care copil este mai mare şi diferenţa de vârstă dintre cei doi. Exemplu : Date de intrare : 6 13 date de ieşire : al doilea copil este mai mare cu 7 ani.  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("varsta copilului 1= ");
    	int v1 = input.nextInt();
        System.out.print("varsta copilului 2= ");
        int v2 = input.nextInt();
        System.out.println(((v1>v2)?"primu copil este mai mare cu "+ (v1-v2):"al doilea copil este mai mare cu "+ (v2-v1))+ " ani");
	}
}