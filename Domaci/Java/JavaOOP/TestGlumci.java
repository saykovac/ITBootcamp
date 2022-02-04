package Domaci20211222;

public class TestGlumci {

    public static void main(String[] args) {

        Glumci glumica1 = new Glumci("Tanja", "Roberts", 'f', 45, 6.02, false);
        Glumci glumica2 = new Glumci("Dzena", "Elfman", 'f', 40, 7.52, false);
        Glumci glumac1 = new Glumci("Ljubomir", "Bandovic", 'm', 40, 0.62, true);

        System.out.println(glumac1);
        System.out.println(glumica1);
        System.out.println(glumica2);

        // Bandovicu prepravljamo ocenu

        glumac1.setOcena(8.62);

        // ponovo ga ispisujemo

        System.out.println(glumac1);


    }



}
