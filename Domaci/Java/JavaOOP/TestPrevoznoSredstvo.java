package Domaci20211227;

public class TestPrevoznoSredstvo {
    public static void main(String[] args) {

        Automobil a1 = new Automobil(2008, "Italija", "Fiat", "cng", 1500);
        Autobus b1 = new Autobus(2009, "Spanija", "Solaris", "dizel", 8000, 55);
        Voz v1 = new Voz(1958, "CSSR", "sinobus", 7);

        a1.sirena();
        b1.sirena();
        v1.sirena();

        // polimorfizam
        PrevoznoSredstvo a2 = new Automobil(2012, "Nemacka", "Audi", "benzin", 2200);
        PrevoznoSredstvo b2 = new Autobus(2020, "Nemacka", "Man", "biodizel", 7000, 60);
        PrevoznoSredstvo v2 = new Voz(1980, "Francuska", "Fratr", 5);

        System.out.println("-------------------");
        System.out.println("polimorfizam");
        a2.sirena();
        b2.sirena();
        v2.sirena();








    }
}
