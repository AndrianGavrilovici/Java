/* 2) Să se calculeze sumele s1=1+2+3+…+n
s2=1*2+2*3+3*4+…+(n-1)*n
s3=1+1*2+1*2*3+…+1*2*3*…*n
s4=12+22+32+…+n2
s5=1/2+2/3+3/4+…+n/(n+1)
s6=2-3+4-5+…-99+100
s7=1+2+22+23+24+…+2n */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n=");
		int n = input.nextInt();
		System.out.print("Alegeti: s1-1,s2-2,s3-3,s4-4,s5-5 sau s6-6: ");
    	char key = input.next().charAt(0);
		switch(key)
		{
			case '1': s1(n); break;
			case '2': s2(n); break;
			case '3': s3(n); break;
			case '4': s4(n); break;
			case '5': s5(n); break;
			case '6': s6(); break;
			default : System.out.println("Nu ati introdus corect!");
		}
	}
	static void s1(int n) {
		int a = 0;
		for (int i = 1; i <= n; ++i) {
			System.out.print(i);
			a += i;
			if (i < n) System.out.print("+");
		}
		System.out.println("=" + a);
	}
	static void s2(int n) {
		int a = 1;
		int c = 0;
		for (int i = 0; i <= n-2; ++i) {
			if (i>=1) System.out.print("+");
			for (int j = i+1; j <= i+2; ++j) {
				System.out.print(j);
				a *= j;
				if (j > i+1) {
					c += a;
					a = 1;
				}
				if (j-2 < i) System.out.print("*");
			}
		}
		System.out.println("=" + c);
		System.out.println("n=3 rasp 8");
		System.out.println("n=4 rasp 20");
		System.out.println("n=5 rasp 40");
	}

	static void s3(int n) {
		int a=1;
		int b=1;
		int c=0;
		for (int i = 1; i <= n; ++i) {
			if (i > 1) System.out.print("+");
			for (int j = 1; j <= i; ++j) {
				System.out.print(j);
				a *= j;
				if (j == i) {
					c += a;
					a = 1;	
				}
				if (i > j) System.out.print("*");
			}
		}
		System.out.println("=" + c);
		System.out.println("n=2rez 3");
		System.out.println("n=3rez 9");
		System.out.println("n=4rez 33");
		System.out.println("n=5rez 153");
	}
	static void s4(int n) {
		int a = (n*10)+2;
		int b = 0;
		for (int i = 12; i <= a; i += 10) {
			System.out.print(i);
			b += i;
			if (i < a) System.out.print("+");
		}
		System.out.println("=" + b);
	}
	static void s5(int n) {
		float a = 1;
		float c = 0;
		for (int i = 1; i < n; i++) {
			if (i > 1) System.out.print("+");
			for (int j = i; j <= i+1; ++j) {
				System.out.print(j);
				if (j > i) {
					a /= j;
					c += a;
					a = j;
				}
				if (j-1 < i) System.out.print("/");				
			}
		}
		System.out.println("=" + c);
		System.out.println("n=3 rasp 1.17");
		System.out.println("n=4 rasp 1.92");
		System.out.println("n=5 rasp 2.72");
	}
	static void s6() {
		int a=2;
		int c=0;
		for (int i = 2; i <= 100; i+=2) {
			if (i > 2) System.out.print("+");
			System.out.print(i);
			for (int j = i+1; j < i+2; j+=1) {
				if (j < 100) {
					a-=j;
					System.out.print("-");
					System.out.print(j);
				}
				if (j > i) {
					c+=a;
					a=i;
				}
			}
		}
		System.out.println("=" + c);
	}
}