package Domaci20211227;

public class Autobus extends Automobil{
    // treba extends PrevoznoSredstvo , ali sam namerno na Automobil
    // da vidim kako se ponasa i da li ce primiti i PrevoznoSredstvo a ne samo Automobil
    // sto i jeste radio
    // jedino onda nije zahtevao program(inteliJ) apstraktnu metodu iz PrevoznoSredstvo
    // vec je zahtevao konstruktor iz Automobil koji je vec sadrzao konstruktor PrevoznoSredstvo

    private int maksimalanBrojPutnika;

    public Autobus(int godinaProizvodnje, String zemljaProizvodnje, String marka, String tipMotora, int kubikazaMotora, int maksimalanBrojPutnika) {
        super(godinaProizvodnje, zemljaProizvodnje, marka, tipMotora, kubikazaMotora);
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public int getMaksimalanBrojPutnika() {
        return maksimalanBrojPutnika;
    }

    public void setMaksimalanBrojPutnika(int maksimalanBrojPutnika) {
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public void sirena() {
        System.out.println("autobus svira: dum dum");
    }

}
