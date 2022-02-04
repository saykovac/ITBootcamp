package Domaci.dom20211217;

//        41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

public class AvgDoubleNiza {

    public static void main(String[] args) {

        double[] niz = {1.23, 0.23, 56.12, 17.12};

        System.out.println("Srednja vrednost niza iznosi :  +" + srVrNiza(niz));

    }


    public static double srVrNiza(double[] prosledjenNiz) {
        double suma = 0;
        for (int i = 0; i < prosledjenNiz.length; i++) {
            suma += prosledjenNiz[i];
        }
        double avg = suma / prosledjenNiz.length;
        return avg;
    }


}
