/* Fie dat tabloul bidimensional A[1..n,1..m] cu elemente nr reale. Sa se compuna un program care va calcula minimul elementelor pozitive si produsul elementelor negative ce se contin in matricea A */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
    	System.out.print("n= ");
    	int n = enter.nextInt();
    	System.out.print("m= ");
    	int m = enter.nextInt();
        double[][] a = new double[n][m];
        double min=0;int c=0;
        for (int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        	    System.out.println("elementul "+(i+1)+":");        		
    	        a[i][j] = enter.nextDouble();
	            if (a[i][j]>0 && c==0){ min=a[i][j];c++; }
        	}
        }
        double produs = 1;
        for (int i=0;i<n;i++){
        	for(int j=0;j<m;j++){        		
        	    if (a[i][j] > 0 && a[i][j] < min) min = a[i][j];
            	if (a[i][j] < 0) produs *= a[i][j];
        	}
        }
        System.out.println("nr minim pozitiv din tablou este : " + min);
        System.out.println("produsul nr negative din tablou este : " + produs);
	}
}