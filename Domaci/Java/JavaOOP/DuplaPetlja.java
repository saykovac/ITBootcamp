package Domaci20211227;

//        1.Dupla petlja:
//        U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
//        (Primer ispisa:
//        Week: 1
//        Day: 1
//        Day: 2
//        Day: 3 //sve do Day: 7
//        Week: 2
//        Day: 1
//        Day: 2
//        Day: 3.......
//        Week: 3
//        Day: 1
//        Day: 2
//        Day: 3......)


public class DuplaPetlja {

    public static void main(String[] args) {
        String w = "Week";
        String d = "Day";

        for (int i = 1; i <= 3; i++) {
            System.out.println("------------POCETAK " + i + ". NEDELjE--------------");
            System.out.println(w + ": " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println(d + ": " + j);
            }
            System.out.println("------------KRAJ " + i + ". NEDELjE--------------");
        }
        System.out.println("------------kraj programa--------------");

    }

}
