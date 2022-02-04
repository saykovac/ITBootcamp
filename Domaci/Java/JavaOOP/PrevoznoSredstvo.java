package Domaci20211227;

public abstract class PrevoznoSredstvo {
    protected int godinaProizvodnje;
    protected String zemljaProizvodnje;
    protected String marka;

    public PrevoznoSredstvo(int godinaProizvodnje, String zemljaProizvodnje, String marka) {
        this.godinaProizvodnje = godinaProizvodnje;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getZemljaProizvodnje() {
        return zemljaProizvodnje;
    }

    public void setZemljaProizvodnje(String zemljaProizvodnje) {
        this.zemljaProizvodnje = zemljaProizvodnje;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    //metoda sirena u PrevoznoSredstvo apstraktna

    public abstract void sirena();
    // apstraktna je i ne treba nista u njoj tj. ne treba { i nista unutar }
    // u podklasama radimo istu metodu

}
