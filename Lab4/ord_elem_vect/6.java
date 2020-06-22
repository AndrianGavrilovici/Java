/* 7) Se cunosc punctajele obţinute de cei n elevi participanţi la un concurs de informatică. Ştiind că doi elevi primesc acelaşi premiu numai dacă au punctaje egale, să se determine câţi elevi primesc Premiul I, câţi Premiul II şi câţi Premiul III. Cerinţă: Scrieţi un program care citeşte de la tastatură numărul concurenţilor precum şi punctajele acestora, luate din borderoul de corectare, şi determină şi afişează pe ecran pe câte o linie numărul de elevi pentru fiecare din cele trei premii. Restricţii: numărul n al elevilor nu depăşeşte 300 iar punctajul fiecăruia este un număr natural cel mult egal cu 100. Exemplu: Pentru n=10 si punctajele: 58 79 34 12 58 40 79 58 30 58 se vor afişa numerele: 2 4 1 ceea ce înseamnă că 2 elevi primesc Premiul I (cei care au obţinut 79 puncte), 4 elevi obţin Premiul II (cei cu 58 puncte) şi un elev (cel cu 40 puncte) primeşte Premiul III. */
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,t=0;
		int[] a = new int[100];
        int b1=0,b2=0;
        int p1=0,p2=0,p3=0;       
        System.out.printf("n= ");
        n = input.nextInt();
        for(int i=0;i<n;++i)
            do{
                System.out.printf("a[%d]= ",i);
                a[i] = input.nextInt();
            }while(a[i]>100||a[i]<0);
        for(int i=0;i<n;++i)
            for(int j=n-1;j>i;--j)
                if(a[j-1]<a[j]){
                	t=a[j-1];
                	a[j-1]=a[j];
                	a[j]=t;
                }
        System.out.printf("Punctele sortate sunt:\n");
        for(int i=0;i<n;++i)
            System.out.printf("%d ",a[i]);
        t=0;
        for(int i=0;i<n;++i)
            for(int j=i;j<i+1;++j)
                if(a[i]>a[i+1] && t<3){
                    t++;
                    System.out.printf("(%d)",a[i]);
                    b1=i;
                }
        System.out.println();
        for(int i=0;i<b1;++i)
            if(a[0]>a[i]){break;}else p1++;
        for(int i=p1;i<b1;++i)
            if(a[p1]>a[i]){break;}else p2++;
        b2 = p1+p2;
        for(int i=b2;i<=b1;++i)
            if(a[b2]>a[i]){break;}else p3++;
        System.out.printf("Premiul I primeste: %d copil (p/n %d puncte)\n",p1,a[0]);
        System.out.printf("Premiul II primeste: %d copil (p/n %d puncte)\n",p2,a[p1]);
        System.out.printf("Premiul III primeste: %d copil (p/n %d puncte)\n",p3,a[b2]);
	}
}