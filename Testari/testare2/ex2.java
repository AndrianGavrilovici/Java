/*
	EVALUARE 2. Programare JAVA Nr. 3	ANDRIAN GAVRILOVICI ( GRUPA 3I )

	Problema 2: Sa se scrie un program care va inscrie intr-un tabel liniar toti anii bisecti cuprinsi intre doi ani 
	calendaristici ale caror valori se introduc de la tastatura. Tabloul obtinut se va afisa pe ecran. 
	Remarca: Ani bisecti ai calendarului Gregorian sunt anii ce se impart la 4 si nu se impart la 100. 
	Toti anii ce se impart la 400 sunt de asemenea ani bisecti.
*/
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print ("Primul an: ");
	    int an1 = input.nextInt();
	    System.out.print ("A doilea an: ");
	    int an2 = input.nextInt();

	    int[] arr = new int[an2-an1];
	    int count = 0;
	    for (int i = an1;i <= an2;i++){
	    	if((i % 4 == 0) && (i % 100 != 0)){
    	    	arr[count] = i;
    	    	count++;
	    	}
    		if(i % 400 == 0){
    			arr[count] = i;
    			count++;
    		}
	    }
	    System.out.println("Anii bisecti cuprinsi intre " + an1 + " si " + an2 + " sunt:");
	    for (int i = 0;i < count;i++){
	    	System.out.print(arr[i] + " ");
	    }

	}
}
