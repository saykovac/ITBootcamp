package Domaci.dom20211209;

//          2.      [Suma intervala]
//                  Korisnik unosi cele brojeve m i n sa konzole, m <= n.
//                  Ispisati sumu brojeva [m, n].

import java.util.Scanner;

public class SumaIntervala {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesite prvi (manji) ceo broj: ");
        int m = sken.nextInt();

        System.out.println("Unesite drugi (veci) ceo broj: ");
        int n = sken.nextInt();
        int suma = 0;


        for (int i = m; i <= n ; i++) {
            suma = suma + i;
        }

        System.out.println("Suma brojeva od prvog unetog " + m + " do drugog unetog " + n + " iznosi " + suma);



    }



}
