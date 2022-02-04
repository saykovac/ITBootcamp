package Domaci.dom20211214;

import java.util.Scanner;

//	        29. -//-. Ispisati svaki treci element u obrnutom redosledu.
//        	Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//        	29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.




public class NizSvakiTreciObrnuto {


    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesi broj clanova u nizu: ");
        int n = sken.nextInt();
        int niz [] = new int[n];

        System.out.println("Unesi " + n + " brojeva");

        for (int i = 0 ; i < niz.length; i++) {
            niz[i] = sken.nextInt();
        }
        System.out.println("Svaki treci broj niza od pozadi je : ");

        for(int i=niz.length-1; i >= 0; i-=3) {      // i ovde bi trebalo da ide od niz3.length-3, -1 je poslednji, al tako je postavljeno u primeru
            System.out.println(niz[i]);
        }


    }


}
