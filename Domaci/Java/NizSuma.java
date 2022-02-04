package Domaci.dom20211214;


//	        28. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
//        	Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
//          28* Napraviti funkciju koja vraca sumu prosledjenog niza.

import java.util.Scanner;

public class NizSuma {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesi broj clanova u nizu: ");
        int n = sken.nextInt();
        int niz [] = new int[n];
        int suma = 0;

        System.out.println("Unesi " + n + " brojeva");

        for (int i = 0 ; i < niz.length; i++) {
            niz[i] = sken.nextInt();
        }

        for (int i = 0 ; i < niz.length; i++) {
            suma = suma + niz[i];
        }
        System.out.println("Suma brojeva u nizu iznosi: " + suma);

    }

}
