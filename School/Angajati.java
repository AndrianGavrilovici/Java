package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Angajati {
    private String nume;
    private String functia;
    private int anulAngajarii;
    private int oreLucrate;
    private int plataOra;
    public void citire(){
        Scanner enter = new Scanner(System.in);
        System.out.print("Numele: ");
        nume = enter.nextLine();
        System.out.print("Functia: ");
        functia = enter.nextLine();
        System.out.print("Anul angajarii: ");
        anulAngajarii = enter.nextInt();
        System.out.print("Ore lucrate: ");
        oreLucrate = enter.nextInt();
        System.out.print("Plata pe ora: ");
        plataOra = enter.nextInt();
    }
    public void afisare(){
        System.out.println("Nume: " + nume);
        System.out.println("Functia: " + functia);
        System.out.println("Stagiu: " + stagiu());
        System.out.println("Salariul primit: " + salariuPimit());
    }
    public int stagiu(){
        return LocalDate.now().getYear() - anulAngajarii;
    }
    private int salariuCalculat(){
        return oreLucrate * plataOra;
    }
    private double spor(){
        if(stagiu() > 5 && stagiu() <= 8)
            return (salariuCalculat() * 15) / 100;
        else if(stagiu() > 8)
            return (salariuCalculat() * 25) / 100;
        return 0;
    }
    public double salariuPimit(){
        return salariuCalculat() + spor();
    }
}
