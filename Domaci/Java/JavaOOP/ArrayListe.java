package Domaci20211227;

//        2. Array liste
//        Kreirajte array listu nekog vaseg interesovanje (npr sport)                       1
//        -u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)   2
//        -iz liste dohvatite 3. element liste i ispisite                                   3
//        -promenite naziv prvog elementa                                                   4
//        -uklonite 5. element                                                              5
//        -ispisite velicinu vase liste                                                     6
//        -pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste      7

import java.util.ArrayList;

public class ArrayListe {
    public static void main(String[] args) {

        ArrayList<String> sportovi = new ArrayList<String>();   //  1

        sportovi.add("bilijar");
        sportovi.add("sketba");                                 //  2
        sportovi.add("dbalfu");
        sportovi.add("bocanje");
        sportovi.add("rukomet");
        sportovi.add("razbi");
        sportovi.add("pljuvanje u dalj");

        String treciSport = "Treci sport u listi je: " + sportovi.get(2);
        System.out.println(treciSport);                         // 3    //  treci element index 2
        System.out.println("--------------------------------");

        sportovi.set(0, "ronjenje");                            // 4    //  prvi element index 0

        sportovi.remove(4);                               // 5     // peti element idex 4

        System.out.println(sportovi.size() + " br sportova");   // 6
        System.out.println("--------------------------------");

        for (int i = 0; i < sportovi.size(); i++) {             // 7
            System.out.println(sportovi.get(i) + " " + (i+1) + ". sport");
        }
        System.out.println("--------------------------------");
        System.out.println("Kraj prvog ispisa liste sportova");
        System.out.println("--------------------------------");

        for (String i : sportovi) {
            System.out.println(i);
        }
        System.out.println("Kraj drugog ispisa liste sportova");
        System.out.println("--------------------------------");


    }
}
