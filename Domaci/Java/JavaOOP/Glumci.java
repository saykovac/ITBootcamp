package Domaci20211222;

//        1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
//        pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom)
//        i da li je iz Srbije odgovorite preko booleana.
//        Sve potrebno za glumca i glumicu da budu dva ispisa (edited)

public class Glumci {

    private  String ime;
    private  String prezime;
    private char pol;
    int godine;
    double ocena;
    boolean daLiJeIzSrb;

    public Glumci(String ime, String prezime, char pol, int godine, double ocena, boolean daLiJeIzSrb) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.daLiJeIzSrb = daLiJeIzSrb;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public double getOcena() {
        return ocena;
    }

    public boolean isDaLiJeIzSrb() {
        return daLiJeIzSrb;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public void setDaLiJeIzSrb(boolean daLiJeIzSrb) {
        this.daLiJeIzSrb = daLiJeIzSrb;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Ime i prezime: ");
        sb.append(ime);
        sb.append(" " + prezime);
        sb.append("\n");

        sb.append("Pol: ");
        sb.append(pol);
        sb.append("\n");

        sb.append("Broj godina: ");
        sb.append(godine);
        sb.append("\n");

        sb.append("Ocena: ");
        sb.append(ocena);
        sb.append("\n");

        sb.append("Da li je iz SRB - ");
        sb.append(daLiJeIzSrb);
        sb.append("\n");

        return sb.toString();
    }




}
