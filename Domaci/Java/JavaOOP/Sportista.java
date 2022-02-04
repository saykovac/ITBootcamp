package Domaci20211222;

//        sport - Napisati klasu Sportista. Sportista ima
//
//        1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
//        2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
//        3) klub za koji igra (polje tipa String) koje moze da se dohvati.
//                Sportista moze da promeni klub za koji igra.
//        4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.
//
//        Napisati glavni program koji kreira tri igraca.
//        U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.

public class Sportista {

    private String imeIprezime;
    private String sportTip;
    private String klub;
    private int broj;


    public Sportista(String imeIprezime, String sportTip, String klub, int broj) {
        this.imeIprezime = imeIprezime;
        this.sportTip = sportTip;
        this.klub = klub;
        this.broj = broj;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public String getSportTip() {
        return sportTip;
    }

    public String getKlub() {
        return klub;
    }

    public int getBroj() {
        return broj;
    }

    // setter samo za promenu kluba i broja dresa

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sportista: ");
        sb.append(imeIprezime);
        sb.append("\n");

        sb.append("Sport: ");
        sb.append(sportTip);
        sb.append("\n");

        sb.append("Klub: ");
        sb.append(klub);
        sb.append("\n");

        sb.append("Broj na dresu: ");
        sb.append(broj);
        sb.append("\n");

        return sb.toString();
    }
}
