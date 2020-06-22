/*
	EVALUARE 2. Programare JAVA Nr. 3	ANDRIAN GAVRILOVICI ( GRUPA 3I )

	Problema 1: Sa se compuna un program care va numara elementele nule si va determina rangul (pozitia) primului element 
	maximal ce se contin intr-un tabel liniar de dimensiunea n cu elemente reale.
*/
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print ("n= ");
	    int n = input.nextInt();
	    double[] arr = new double[n];
	    for (int i = 0;i < n;i++){
	    	System.out.print("arr["+i+"]= ");
	    	arr[i] = input.nextDouble();
	    }
	    System.out.println("Numerele introduse sunt:");
	    for (int i = 0;i < n;i++){
	    	System.out.print(arr[i]+ "   ");
	    }
	    System.out.println();
	    int zero_count = 0;
	    double max = arr[0];
	    int poz_max = 0;
	    for (int i = 0;i < arr.length;i++){
	    	if (arr[i] == 0) zero_count++;
	    	if (arr[i] > max){
	    		max = arr[i];
	    		poz_max = i;
	    	}
	    }
	    System.out.println ("Nr. de elemente nule - " + zero_count);
	    System.out.println ("Nr. maximal este - " + max + ", pe pozitia - " + poz_max);
	}
}
