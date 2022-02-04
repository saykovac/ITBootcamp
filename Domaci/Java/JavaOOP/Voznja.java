package Domaci20211222;

public class Voznja {

    public static void main(String[] args) {

        Automobil aut1 = new Automobil("Dacia", "Duster", 3215, "George Hadzi");
        Automobil aut2 = new Automobil("Reno", "Klio", 84796, "Erik Kantona");
        Automobil aut3 = new Automobil("Opel", "Meriva", 1247, "Aki Kaurismaki");
        Automobil aut4 = new Automobil("Zastava", "Z10", 5546); // bez vlasnika; niko zastavu nece

        System.out.println(aut1);
        System.out.println(aut2);
        System.out.println(aut3);
        System.out.println(aut4);




    }

}
