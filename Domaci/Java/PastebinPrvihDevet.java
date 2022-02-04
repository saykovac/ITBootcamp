package Domaci.dom20211209;

import java.util.Scanner;

public class PastebinPrvihDevet {
    public static void main(String[] args) {


        Scanner sken = new Scanner(System.in);


//        1.    Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
//
//
//        System.out.println("Unesite ceo broj: ");
//        int n = sken.nextInt();
//
//        if (n % 2 != 0) {
//            System.out.println("Uneti broj " + n + " nije paran.");
//        } else {
//            System.out.println("Uneti broj " + n + " je paran");
//        }
//
//
//
//
//        2.    Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0,
//              "Negativan" ako je strogo manji od 0 ili
//              "Neutralan" ako je tacno 0.
//
//
//        System.out.println("Unesite ceo broj: ");
//        int n = sken.nextInt();
//
//        if (n < 0) {
//            System.out.println(" Uneti broj: " + n + " je negativan");
//        } else if (n == 0) {
//            System.out.println(" Uneti broj: " + n + " je neutralan");
//        }  else if (n > 0) {
//            System.out.println(" Uneti broj: " + n + " je pozitivan");
//        }
//
//
//
//
//        3.    Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
//
//
//        System.out.println("Unesite ceo pozitivan broj: ");
//        int n = sken.nextInt();
//
//        for (int i = 0; i <= n ; i++) {
//            System.out.println(i);
//        }
//
//
//
//        4.    Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
//
//
//
//        System.out.println("Unesite ceo negativan broj: ");
//        int n = sken.nextInt();
//
//        for (int i = n; i <= 0 ; i++) {
//            System.out.println(i);
//        }
//
//
//
//         5.   Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.
//
//
//
//        System.out.println("Unesite ceo pozitivan broj: ");
//        int n = sken.nextInt();
//
//        for (int i = -14; i <= 2*n ; i++) {
//            System.out.println(i);
//        }
//
//
//
//
//        6.    Ispisati proizvod prvih n celih brojeva [1, n].
//
//
//        System.out.println("Unesite ceo pozitivan broj: ");
//        int n = sken.nextInt();
//        int faktorijel = 1;
//
//
//        for (int i = 1; i <= n ; i++) {
//
//            faktorijel = faktorijel * i;
//
//        }
//        System.out.println("Proizvod prethodnih brojeva do unetog iznosi: " + faktorijel);


//        7.    Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.


//        int dan;
//        int mesec;
//        String horoskop = "U horoskopu ste: ";
//
//        System.out.println("Unesite datum rodjenja: ");
//        dan = sken.nextInt();
//
//        System.out.println("Unesite mesec rodjenja u vidu broja: ");
//        mesec = sken.nextInt();
//
//        if ((dan>21 && mesec == 12) || (dan<=19 && mesec== 1)){
//            System.out.println(horoskop + "jarac");
//        }
//        if ((dan>20 && mesec ==1) || (dan<=18 && mesec == 2)){
//            System.out.println(horoskop + "vodolija");
//        }
//        if ((dan>19 && mesec == 2) || (dan <=20 && mesec == 3)){
//            System.out.println(horoskop + "riba");
//        }
//        if ((dan>21 && mesec == 3) || (dan <=20 && mesec == 4)){
//            System.out.println(horoskop + "ovan");
//        }
//        if ((dan>21 && mesec == 4) || (dan <=20 && mesec == 5)){
//            System.out.println(horoskop + "bik");
//        }
//        if ((dan>21 && mesec == 5) || (dan<=20 && mesec == 6)){
//            System.out.println(horoskop + "blizanac");
//        }
//        if ((dan>21 && mesec == 6) || (dan<=20 && mesec == 7)){
//            System.out.println(horoskop + "rak");
//        }
//        if ((dan>21 && mesec  == 7) || (dan<=20 && mesec== 8)){
//            System.out.println(horoskop + "lav");
//        }
//        if ((dan>21 && mesec ==8) || (dan<=22 && mesec == 9)){
//            System.out.println(horoskop + "devica");
//        }
//        if ((dan>23 && mesec == 9) || (dan<=20 && mesec ==10)){
//            System.out.println(horoskop + "vaga");
//        }
//        if ((dan>21 && mesec == 10) || (dan<=22 && mesec == 11)){
//            System.out.println(horoskop + "skorpija" + " idemoooo");
//        }
//        if ((dan>23 && mesec == 11) || (dan<=20 && mesec == 12)){
//            System.out.println(horoskop + "strelac");
//        }




//        8.    Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
//              "Dobrodosao u {x}. razred, {ime} {prezime}",
//               pod pretpostavkom da je trenutna godina 2021.
//               Pretpostavimo da ima 12 razreda.
//               A ako korisnik nije djak ispisati jednu odgovarajucu
//               poruku od:
//              "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"


//        System.out.println("Unesite ime: ");
//        String ime = sken.next();
//        System.out.println("Unesite prezime: ");
//        String prezime = sken.next();
//        System.out.println("Unesite godinu rodjenja: ");
//        int godRodj = sken.nextInt();
//
//        int razred = 2021 - godRodj - 6;
//
//        if(razred >= 1 && razred <= 12) {
//            System.out.println(ime + " " + prezime + " ide u " + razred + ". razred");
//        } else if (razred < 1){
//            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje");
//        } else if( razred > 12) {
//            System.out.println(ime + " " + prezime + " je zavrsio/la skolu");
//        }



//        9.     Za unet ceo broj n, ispisati za svaki od brojeva [1, n]
//               "Fizz" ako je deljiv sa 3,
//               "Buzz" ako je deljiv sa 5,
//               "Zazz" ako je deljiv sa 7
//               i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)


        System.out.println("Unesite ceо pozitivan broj : ");
        int n = sken.nextInt();


        if (n <= 0) {
            System.out.println("Morate uneti ceo pozitivan broj.");
        }


        for (int i = 1; i <= n; i++) {

            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i+ ". " + " ");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println(i+ ". " + "FizzBuzzZazz");   // deljivo sa 3 i 5 i 7 "FizzBuzzZazz"
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i+ ". " + "BuzzZazz");   // deljivo sa 5 i 7 "BuzzZazz"
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i+ ". " + "FizzZazz");   // deljivo sa 3 i 7 "FizzZazz"
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+ ". " + "FizzBuzz");   // deljivo sa 3 i 5 "FizzBuzz"
            } else if (i % 7 == 0) {   // deljivo sa 7 "Zazz"
                System.out.println(i+ ". " + "Zazz");
            } else if (i % 5 == 0) {   // deljivo sa 5 "Buzz"
                System.out.println(i+ ". " + "Buzz");
            } else if (i % 3 == 0) {    // deljiv sa 3 "Fizz"
                System.out.println(i+ ". " + "Fizz");
            }
        }



    }

}
