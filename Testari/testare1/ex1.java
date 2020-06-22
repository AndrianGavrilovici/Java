import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double[] arr = new double[255];
	    int count_negativ = 0;
	    double max_negativ = 0, suma_pozitiv = 0;
		System.out.println("n=");
		 Scanner input = new Scanner(System.in);
		 int n = input.nextInt();
		 for(int i=0;i<n;i++){
		     arr[i] = input.nextDouble();
		     if (arr[i] < 0) {
		        count_negativ++;
		        if(arr[i] < max_negativ)
		            max_negativ = arr[i];
		     }else{
		         suma_pozitiv += arr[i];
		     }       
		 }
		 System.out.println("nr maxim de elemente negative: " + count_negativ);
		 System.out.println("numarul cel mai negativ: " + max_negativ);
		 System.out.println("suma elementelor pozitive: " + suma_pozitiv);
	}
}
