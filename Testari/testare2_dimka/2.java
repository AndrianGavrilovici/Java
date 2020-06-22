/* Se considera un nr natural n. Sa se compuna un program care va inscrie cifrele acestui nr intr-un tablou liniar. Tabloul obtinut se va afisa la ecran */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
    	System.out.print("n= ");
    	int n = enter.nextInt();
        int n_copy=n;
        int count=0;
        while(n_copy>0){
            n_copy /= 10;
            count++;
        }
        int c;
        int[] a = new int[count+1];
        int j=0;
        while(n>0){
            c=n%10;
            a[j]=c;
            j++;
            n /= 10;
        }
        System.out.println("Numerele din tablou sunt:");
        for(int i=0;i<count;i++){
            System.out.print(a[i]+ " ");
        }
	}
}