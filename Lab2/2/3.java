/* 3) Ionel spune părinţilor doar notele mai mari sau egale cu 7. Într-o zi el a luat trei note. Introduceţi-le în calculator şi afişaţi acele note pe care le va comunica şi părinţilor. Exemplu : Date de intrare 8 7 5 Date de ieşire 8 7. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.print("nota1= ");
    	int n1 = input.nextInt();
        System.out.print("nota2= ");
    	int n2 = input.nextInt();
        System.out.print("nota3= ");
    	int n3 = input.nextInt();
		System.out.println((n1>=7?n1:"")+(n2>=7?" "+ n2:"")+(n3>=7?" "+n3:""));
	}
}