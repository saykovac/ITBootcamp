package Domaci.dom20211203;

//      2. FizzBuzz
//
//        Za uneti celobrojni nenegativan broj n,
//        ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz" ako je on deljiv sa 3,
//        nisku "Buzz" ako je on deljiv sa 5,
//        a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.
//
//
//        Primer      Input:      Output:
//                                1:
//                                2:
//                                3: Fizz
//                                4:
//                                5: Buzz
//        1              10       6: Fizz
//                                7:
//                                8:
//                                9: Fizz
//                                10: Buzz
//
//
//
//                                1:
//                                2:
//                                3: Fizz
//                                4:
//                                5: Buzz
//                                6: Fizz
//                                7:
//                                8:
//                                9: Fizz
//                                10: Buzz
//        2              20       11:
//                                12: Fizz
//                                13:
//                                14:
//                                15:
//                                FizzBuzz
//                                16:
//                                17:
//                                18: Fizz
//                                19:
//                                20: Buzz
//
//
//        3               1





import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesite ceо pozitivan broj : ");
        int n = sken.nextInt();


        if (n <= 0) {
            System.out.println("Morate uneti ceo pozitivan broj.");
        }


        for (int i = 1; i <= n; i++) {

            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i+ ". " + " ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+ ". " + "FizzBuzz");
            } else if (i % 5 == 0) {   // deljivo sa 5 "Buzz"
                System.out.println(i+ ". " + "Buzz");
            } else if (i % 3 == 0) {    // deljiv sa 3 "Fizz"
                System.out.println(i+ ". " + "Fizz");
            }
        }




    }

}
