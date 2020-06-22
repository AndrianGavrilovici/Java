/* 1) Se introduc două numere nenule şi un semn de operaţie (+,-,*,/). Să se efectueze cu cele două numere operaţia introdusă şi să se afişeze expresia care s-a calculat urmată de semnul = şi de valoarea ei. Exemplu: Date de intrare 10 6 * Date de ieşire 10*6=60. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("n1= ");
    	int n1 = input.nextInt();
        System.out.print("n2= ");
        int n2 = input.nextInt();
        System.out.print("operatia (+,-,*,/)= ");
    	char op = input.next().charAt(0);
		if (op != '+' && op != '-' && op != '*' && op != '/'){
			System.out.println("Nu ati introdus operatia corect!");
			return;
		}
		switch(op){
			case '+': 
				System.out.println(n1+ " + "+ n2+ " = "+ (n1+n2));
				break;
			case '-':
				System.out.println(n1+ " - "+ n2+ " = "+ (n1-n2));
				break;
			case '*':
				System.out.println(n1+ " * "+ n2+ " = "+ (n1*n2));
				break;
			case '/':
				if (n2 == 0)
					System.out.println("Impartirea la 0 nu exista");
				else 
					System.out.println(n1+ " / "+ n2+ " = "+ ((float)n1/(float)n2));
				break;				
		}
	}
}