package Domaci20211222;

public class TestSportista {

    public static void main(String[] args) {
        Sportista sportas1 = new Sportista("Toto Skilaci", "fudbal", "nepoznat", 19);
        Sportista sportas2 = new Sportista("Jan Zelezni", "atletika", "Sparta", 7);
        Sportista sportas3 = new Sportista("Zero Cage", "nfl", "LA", 99);
        Sportista sportas4 = new Sportista("Mia Petrova", "klizanje", "Spartak", 5);

        System.out.println(sportas1);
        System.out.println(sportas2);
        System.out.println(sportas3);
        System.out.println(sportas4);

        // Zero Cage menja broj u nula
        sportas3.setBroj(0);

        // Toto Skilaci potpisuje za Bari
        sportas1.setKlub("Bari");

        // proveravamo samo promene
        System.out.println(sportas3);
        System.out.println(sportas1);


    }





}
