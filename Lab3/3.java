/* 1) Să se determine toate tripletele de numere a, b, c cu proprietăţile: 1<a<b<c<100; a+b+c se divide cu 10. */
class Main {
	public static void main(String[] args) {
		for (int a = 1; a < 100; ++a)
			for (int b = a+1; b < 100; ++b)
				for (int c = b+1; c < 100; ++c)
					if ( ((a+b+c) % 10) == 0 )
						System.out.println("1 < "+a+" < "+b+" < "+c+" < 100");
	}
}