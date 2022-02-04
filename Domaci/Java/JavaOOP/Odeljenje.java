package Domaci20211224;
//        ---------------------------------------------------------------------------------------------------------------------------------------
//        Napisati klasu Odeljenje koja ima sledeca polja:
//        - String oznaka
//        - ArrayList dnevnik
//
//        Napisati 2 konstruktora, opet na isti nacin.
//        Napisati gettere i settere za sva polja.
//        Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
//        Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
//        Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
//        Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
//        Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
//        Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
//        Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
//        Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
//        Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
//        Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
//        - "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
//        - "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
//        - "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
//        - "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
//        - "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu
//        Napisati metod izlistajDnevnik() koja vraca String oblika:
//        {ime} i {prezime} ima ocene:
//        {ocene}
//        za sve ucenike.
//        Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
//        - "Veliko odeljenje"; ako ima vise od 25 ucenika
//        - "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
//        - "Malo odeljenje"; ako ima ucenika manje od 15
//        Napisati toString() metod:
//        {Oznaka} odeljenja ima djake:
//        {Ime1} {Prezime1}
//        {Ime2} {Prezime2}
//        .
//        .
//        .
//        {ImeN} {PrezimeN}

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();   // ostavlja se prazan

    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }


    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(u);
    }

    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int redniBroj) {
        dnevnik.remove(redniBroj);
    }

    public void pogledajOcene(Ucenik u) {
        System.out.println(u.getNizOcene());
    }

    public void pogledajOcene(int redniBroj) {
        System.out.println(dnevnik.get(redniBroj).getNizOcene());
    }

    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosek());

    }

    public void prosecnaOcena(int redniBroj) {
        System.out.println(dnevnik.get(redniBroj).prosek());
    }

    public double prosecnaOcenaOdeljenja() {
        if (dnevnik.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Ucenik ucenik : dnevnik) {
            suma = suma + ucenik.prosek();
        }
        return suma / dnevnik.size();
    }

    public void opisnaOcena(Ucenik u) {
        if (u.prosek() >= 1) {
            System.out.println("Nedovoljan.");
        }else if (u.prosek() >= 4.5) {
            System.out.println("Odlican.");
        } else if (3.5 <= u.prosek() || u.prosek() < 4.5) {
            System.out.println("Vrlo dobar.");
        } else if (2.5 <= u.prosek() || u.prosek() < 3.5) {
            System.out.println("Dobar.");
        } else if (1.5 <= u.prosek() || u.prosek() < 2.5) {
            System.out.println("Dovoljan.");
        }
    }

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme());
            sb.append(" i ");
            sb.append(ucenik.getPrezime());
            sb.append(" ima ocene:");
            sb.append("\n");
            sb.append(ucenik.getNizOcene());
        }
        return sb.toString();
    }

    public String velicinaOdeljenja() {

        String velicinaOdeljenja = "";
        if (dnevnik.size() > 25) {
            velicinaOdeljenja = "Veliko odeljenje.";
        } else if (dnevnik.size() < 15 || dnevnik.size() < 25) {
            velicinaOdeljenja = "Srednje odeljenje.";
        } else if (dnevnik.size() < 15) {
            velicinaOdeljenja = "Malo odeljenje.";
        }

        return velicinaOdeljenja;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenja ima djake:");
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme());
            sb.append(" ");
            sb.append(ucenik.getPrezime());
        }
        return sb.toString();
    }

}
