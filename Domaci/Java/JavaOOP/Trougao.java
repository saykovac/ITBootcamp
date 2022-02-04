package Domaci.dom20211221;

//                Klasa trougao ima 3 polja koji predstavljaju stranice: stranicaA, stranicaB, stranicaC.
//                Vrednost stranica je tipa double.
//                Napisati konstruktor, getter i setter metode za sve stranice i metode za racunanje obima i povrsine.

public class Trougao {
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        if (stranicaA <= 0 || stranicaB <= 0 || stranicaC <= 0) {
            System.out.println("Nepravilan unos ! Svaka stranica mora biti pozitivan broj !");  // opsti uslov
        } else if (((stranicaA + stranicaB) <= stranicaC) || ((stranicaA + stranicaC) <= stranicaB) || ((stranicaC + stranicaB) <= stranicaA)){
            System.out.println("Nepravilan unos ! Zbir bilo koje dve stranice MORA biti veci od duzine preostale stranice !");  //  uslov za Heronovu formulu
        }
        else{
            this.stranicaA = stranicaA;
            this.stranicaB = stranicaB;
            this.stranicaC = stranicaC;
        }
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }

    // obim trougla

    public double obimTrougla(){
        double obim = stranicaA + stranicaB + stranicaC;
        return obim;
    }

    // povrsina trougla
    public double povrsinaTrougla() {
        double o = 0.5 * obimTrougla();   // umesto ½  0.5 ;
        double povrsina = Math.sqrt(o * (o - stranicaA) * (o - stranicaB) * (o - stranicaC));
        return povrsina;

        // o = ½(a + b + c)       ------->  pola obima
        // P = √o(o - a)(o - b)(o - c) -    Heronova formula (koja bas i nije najsjajnija, zato je ubacen dodatni uslov)
                                        //  za izracunavanje povrsine trougla sa vrednostima stranica, a BEZ uglova i neke od kateta tj visina
    }
}
