/* 13) Dan are de făcut mai multe exerciţii de transformare în centimetri a unei mărimi date în metri. Realizaţi un program care să citescă valoarea în metri şi să o afişeze în centimetri. Exemplu: date de intrare: 72 date de ieşire: 7200 cm.  */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("metri= ");
    	int m = input.nextInt();
    	int cm=m*100;
		System.out.println(m+ " metri = "+ cm+ " cm");
	}
}