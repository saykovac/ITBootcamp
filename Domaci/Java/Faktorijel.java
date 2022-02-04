package Domaci.dom20211203;

//        3. Faktorijel


//        Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
//        Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.
//        Dakle, npr:
//        5! = 5 * 4 * 3 * 2 * 1 = 120
//        3! = 3 * 2 * 1 = 6
//        6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
//
//            Primer      Input:      Output:
//            1           1           1
//            2           2           2
//            3           3           6
//            4           4           24
//            5           5           120
//            6           6           720
//            7           10          3628800




import java.util.Scanner;

public class Faktorijel {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesite ceо pozitivan broj : ");
        int n = sken.nextInt();

        if (n <= 0) {
            System.out.println("Morate uneti ceo pozitivan broj.");
        }


        int faktorijel = 1;

        for (int i = 1; i <= n; i++) {
            faktorijel = faktorijel * i;
        }

        System.out.println("Faktorijel unetog broja " + n + " iznosi : " + faktorijel);



    }

}
