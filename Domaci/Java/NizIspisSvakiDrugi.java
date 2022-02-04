package Domaci.dom20211214;
//	        27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
//        	Primer: [1, 2, 3, 4, 5] -> 1 3 5
//        	27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

import java.util.Scanner;

public class NizIspisSvakiDrugi {


    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesi broj clanova u nizu: ");
        int n = sken.nextInt();
        int niz1 [] = new int[n];

        System.out.println("Unesi " + n + " brojeva");

        for (int i = 0 ; i < niz1.length; i++) {
            niz1[i] = sken.nextInt();
        }
        System.out.println("Svaki drugi broj od prvog u nizu je : ");
        for (int i = 0 ; i < niz1.length; i+=2) {   //  brojac treba da krece od jedan jer ispisujemo svaki drugi a 1 se nalazi na drugom mestu, prvo mesto ima index vrednost 0
            System.out.println(niz1[i]);
        }

    }






}
