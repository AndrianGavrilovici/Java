import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("n=");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int num[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
        String sym[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
        int div;int count, i=12;
        while(number>0) 
        { 
            div = number/num[i]; 
            number = number%num[i]; 
            for(int j=0;j<div;j++)
            { 
                System.out.print(sym[i]); 
            } 
            i--; 
        } 
	}
}
