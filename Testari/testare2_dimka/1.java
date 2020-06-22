/* Sa se compuna un program care va calcula minimul elementelor pozitive si produsul elementelor negative ce se contin intr-un tabel linear de dimensiunea n cu elemente numere reale */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
    	System.out.print("n= ");
    	int n = enter.nextInt();
        double[] a = new double[n];
        double min=0;int c=0;
        for (int i=0;i<n;i++){
            System.out.println("elementul "+(i+1)+":");
            a[i] = enter.nextDouble();
            if (a[i]>0 && c==0){ min=a[i];c++; }
        }
        double produs = 1;
        for (int i=0;i<n;i++){
            if (a[i] > 0 && a[i] < min) min = a[i];
            if (a[i] < 0) produs *= a[i];
        }
        System.out.println("nr minim pozitiv din tablou este : " + min);
        System.out.println("produsul nr negative din tablou este : " + produs);
	}
}