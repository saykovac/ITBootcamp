package Domaci.dom20211217;

//      42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

import java.util.Scanner;

public class StringImenaNiza {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //String[] imena = {"Jovan" , "Petar", "Milica", "Vera", "Sofija", "Kamenko"};

        System.out.println("Unesite ime : ");
        String ime = sc.next();
        System.out.println(traziIme(ime));


    }

    public static String traziIme(String prosledjenoIme) {
        String[] imena = {"Jovan", "Petar", "Milica", "Vera", "Sofija", "Kamenko"};
        String ima = "Uneto ime " + prosledjenoIme + " postoji.";
        String nema = "Uneto ime " + prosledjenoIme + " ne postoji.";
        String prazan = "";

        for (int i = 0; i < imena.length; i++) {
            if(prosledjenoIme.equals("Marija") || prosledjenoIme.equals("Petar")) {
                return prazan+ima;
            } else {
            } return prazan+nema;
        }
        return prazan;




    }

}
