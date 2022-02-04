package Domaci.dom20211221;

import java.util.Scanner;

public class TestTrougao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Unesite prvu stranicu trougla : ");
        double stranicaA = sc.nextDouble();
        System.out.println("Unesite drugu stranicu trougla : ");
        double stranicaB = sc.nextDouble();
        System.out.println("Unesite trecu stranicu trougla : ");
        double stranicaC = sc.nextDouble();

        Trougao tro = new Trougao(stranicaA, stranicaB, stranicaC);

        System.out.println("Duzina prve stranica trougla je : " + tro.getStranicaA());
        System.out.println("Duzina druge stranica trougla je : " + tro.getStranicaB());
        System.out.println("Duzina trece stranica trougla je : " + tro.getStranicaC());
        System.out.println("Obim trougla je : " + tro.obimTrougla());
        System.out.println("Povrsina trougla je " + tro.povrsinaTrougla());

    }

}
