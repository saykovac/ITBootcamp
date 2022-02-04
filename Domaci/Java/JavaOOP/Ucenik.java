package Domaci20211224;

//9.
//        Napisati klasu Ucenik koja ima sledeca polja:
//        - String ime
//        - String prezime
//        - ArrayList ocene
//
//        Napisati 2 konstruktora, jedan koji prima argumente za sva polja,
//        a drugi koji prima ime i prezime, a ocene postavlja na praznu listu.
//        Napisati gettere i settere za sva polja.
//        Napisati toString() metod:
//        {ime} i {prezime} ima ocene:
//        {ocene}
//        Napisati metod proske koji racuna prosek Ucenika.
//        ---------------------------------------------------------------------------------------------------------------------------------------
//        Napisati klasu Odeljenje koja ima sledeca polja: sl klasa

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> nizOcene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> nizOcene) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcene = nizOcene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcene = new ArrayList<Integer>();   // ostavlja se prazan
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Integer> getNizOcene() {
        return nizOcene;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setNizOcene(ArrayList<Integer> nizOcene) {
        this.nizOcene = nizOcene;
    }

    public void dodajuOcenu(int ocena) {
        nizOcene.add(ocena);
    }

    public double prosek() {
        double suma = 0;
        for (int ocena : nizOcene) {
            suma = suma + ocena;
        }
        return suma / nizOcene.size();

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Ime ");
        sb.append(ime);
        sb.append(" i ");
        sb.append(" prezime ");
        sb.append(prezime);
        sb.append(" ima ocene: ");
        sb.append(nizOcene);
        return sb.toString();
    }
}
