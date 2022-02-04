package Domaci.dom20211214;


//	        30. -//-. Izracunati proizvod elemenata tog niza.
//        	Primer: [2, 4] -> 8
//        	30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.


import java.util.Scanner;

public class NizProizvod {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesi broj clanova u nizu: ");
        int n = sken.nextInt();
        int niz [] = new int[n];
        int proizvod = 1;

        System.out.println("Unesi " + n + " brojeva");

        for (int i = 0 ; i < niz.length; i++) {
            niz[i] = sken.nextInt();
        }

        for (int i = 0 ; i < niz.length; i++) {
            proizvod = proizvod * niz[i];
        }
        System.out.println("Proizvod brojeva u nizu iznosi: " + proizvod);



    }

}
