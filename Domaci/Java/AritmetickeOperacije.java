package Domaci.dom20211203;

//Domaci zadatak [3.DEC.2021.]
//
//
//
//
//        1. Aritmeticke opracije
//        Na standardni ulaz se unose dva cela broja.
//        Ispisati na standardnom izlazu u zasebnim redovima
//        zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim
//        tim redom.
//
//        Primer   Input:          Output:
//                                    8
//                                    2
//            1       5               15
//                    3               1
//                                    2
//
//
//                                    5
//                                    -9
//            2       -2              -14
//                    7                0
//                                    -2


import java.text.DecimalFormat;
import java.util.Scanner;

public class AritmetickeOperacije {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesite prvi CEO broj: ");
        int x = sken.nextInt();
        System.out.println("Unesite drugi CEO broj: ");
        int y = sken.nextInt();

        int zbir = x + y;
        int razlika = x - y;
        int proizvod = x * y;
        int kolicnik = x / y;
        int ostatak = x % y;
//        DecimalFormat df = new DecimalFormat("#.###");   // skracivanje na tri decimale


            System.out.println("Zbir unetih brojeva " + x + " i " + y + " iznosi : " + zbir);
            System.out.println("Razlika unetih brojeva " + x + " i " + y + " iznosi : " + razlika);
            System.out.println("Proizvod unetih brojeva " + x + " i " + y + " iznosi :   " + proizvod);

            if (ostatak == 0) {
                System.out.println("Kolicnik unetih brojeva " + x + " i " + y + " iznosi :   " + kolicnik);
                //            System.out.println("Nema ostatka u deljenju brojeva " + x + " i " + y);
            } else {
                System.out.println("Kolicnik unetih brojeva " + x + " i " + y + " iznosi :   " + kolicnik + "\n, a ostatak pri deljenju iznosi " + ostatak);
                //            System.out.println("Ostatak kod kolicnika brojeva " + x + " i " + y + " iznosi : " + ostatak);
            }




    }

}
