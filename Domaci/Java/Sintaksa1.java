package Domaci.dom20211130;

//1.	Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
//        tako sto se ivice prostorije ucitavaju preko konzole.
//        (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).


import java.text.DecimalFormat;
import java.util.Scanner;

public class Sintaksa1 {

    //1.	Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
//        tako sto se ivice prostorije ucitavaju preko konzole.
//        (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Unesite visinu plafona u m : ");
        double h = scanner.nextDouble();

        System.out.print("Unesite duzinu kraceg zida u m : ");
        double l1 = scanner.nextDouble();

        System.out.print("Unesite duzinu duzeg zida u m : ");
        double l2 = scanner.nextDouble();

        System.out.println("Povrsina prostorije za krecenje u m\u00b2 iznosi : ");
        double rezultat = 2*h*(l1+l2) + (l1*l2);     // l1*l2 je plafon
        DecimalFormat df = new DecimalFormat("#.##");   // skracivanje na dve decimale
        System.out.println(df.format(rezultat));


        try {
            Thread.sleep(2000);
            System.out.println("Када кречите, кречите...");     // traume od jedne od najdebilnijih reklama
        }

        catch(InterruptedException e){
            System.err.print(e.getMessage());
        }

        try {
            Thread.sleep(1500);
            System.out.print("...али стварно.");
        }

        catch(InterruptedException e){
            System.err.println(e.getMessage());
        }


    }

}


