package Domaci.dom20211209;

//          1.      [Dupli faktorijel]
//                  Napisati program koji racuna dupli faktorijel unetg broja n.
//                  Dupli faktorijel broja n je:
//                  n!! = n * (n-2) * (n-4) * ... * (2 ili 1)



import java.util.Scanner;

public class DupliFaktorijel {

    public static void main(String[] args) {

        Scanner sken = new Scanner(System.in);

        System.out.println("Unesite br da dobijete njegov dupli faktorijel: ");

        int n = sken.nextInt();

        int dupliFaktorijel = 1;

        if(n % 2 !=0) {
            for (int i = n; i >= 2; i-=2) {
                dupliFaktorijel = dupliFaktorijel * i;
            }
        } else {
            for (int i = n; i >= 1; i-=2) {
                dupliFaktorijel = dupliFaktorijel * i;
            }
        }

        System.out.println("Dupli faktorijel unetog broja " + n + " iznosi : " + dupliFaktorijel);


    }

}
