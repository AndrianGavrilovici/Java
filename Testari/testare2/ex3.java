/*
	EVALUARE 2. Programare JAVA Nr. 3	ANDRIAN GAVRILOVICI ( GRUPA 3I )

	Problema 3: Fie dat tabloul bidimensional A[1..n,1..m] cu elemente numere reale.
	Sa se compuna un program care va numara elementele nule si va determina pozitia
	(numarul liniei si numarul coloanei) primei intalniri a elementului maximal, la parcurgerea
	pe linii a matricei A.
*/
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("n= ");
	    int n = input.nextInt();
	    System.out.print("m= ");
	    int m = input.nextInt();
	    double[][] A = new double[n][m];
	    for (int i = 0;i < n;i++){
	    	for (int j = 0;j < m;j++){
	    		System.out.print("A["+i+"]["+j+"]= ");
	    		A[i][j] = input.nextDouble();
	    	}
	    }
	    System.out.println("Elementele introduse sunt:");
	    for (int i = 0;i < n;i++){
	    	for (int j = 0;j < m;j++){
	    		System.out.print(A[i][j]+ "\t");
	    	}
	    	System.out.println();
	    }
	    int zero_count = 0;
	    double max = A[0][0];
	    int poz_maxi = 0;
	    int poz_maxj = 0;
	    for (int i = 0;i < n;i++){
	    	for (int j = 0;j < m;j++){
	    		if (A[i][j] == 0) zero_count++;
	    		if (A[i][j] > max){
		    		max = A[i][j];
		    		poz_maxi = i;
		    		poz_maxj = j;
		    	}
	    	}
	    	System.out.println ("Nr. maximal pe linia "+(poz_maxi+1)+" este - "+max+", linia - "+(poz_maxi+1)+", coloana - "+(poz_maxj+1));
	    	System.out.println ("Pozitia["+ poz_maxi+ ","+ poz_maxj+ "]");
	    	if (i < n-1){
	    		max = A[i+1][0];
		    	poz_maxi = i+1;
		    	poz_maxj = 0;
	    	}
	    }
	    System.out.println ("Nr. de elemente nule - " + zero_count);
	}
}
