package Domaci.dom20211130;

//    Grananja1: Napisati program koji proverava da li je uneti broj paran.
//    Ukoliko jeste, program treba da ispise poruku: Broj je paran!
//    Ukoliko nije, program treba da ispise poruku: Broj je neparan!


import java.util.Scanner;

public class Grananja1 {
//    Grananja1: Napisati program koji proverava da li je uneti broj paran.
//    Ukoliko jeste, program treba da ispise poruku: Broj je paran!
//    Ukoliko nije, program treba da ispise poruku: Broj je neparan!

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Unesite ceo broj pozitivan: ");

        int broj = scanner.nextInt();


        if (broj <= 0) {

            System.out.println("Niste uneli pozitivan broj !");

        }
        else if (broj % 2 != 0) {

            System.out.println("Uneti broj je neparan");

        } else if(broj % 2 == 0) {

            System.out.println("Uneti broj je paran");
        }




        System.out.println("Prijatno");


    }

}

