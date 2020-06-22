import java.util.Scanner;
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("1-coltul stang;2-varful;3-coltul drept");
		System.out.print("x1,y1= ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		System.out.print("x2,y2= ");
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		System.out.print("x3,y3= ");
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		
		System.out.print("x,y= ");
		int x = input.nextInt();
		int y = input.nextInt();
		if(isInside(x1,y1,x2,y2,x3,y3,x,y)){
		    System.out.println("punctul se afla in triunghi ");
		}else System.out.println("punctul nu se afla in triunghi ");
	}
	static double area(int x1, int y1, int x2, int y2, int x3, int y3) 
    { 
       return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ 
                                    x3*(y1-y2))/2.0); 
    } 
    static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) 
    {    
        double A = area (x1, y1, x2, y2, x3, y3); 
       
        double A1 = area (x, y, x2, y2, x3, y3); 
       
        double A2 = area (x1, y1, x, y, x3, y3); 
       
        double A3 = area (x1, y1, x2, y2, x, y); 
         
        return (A == A1 + A2 + A3); 
    } 
}
