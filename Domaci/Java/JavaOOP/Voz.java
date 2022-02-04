package Domaci20211227;

public class Voz extends PrevoznoSredstvo{

    private int vagon;

    public Voz(int godinaProizvodnje, String zemljaProizvodnje, String marka, int vagon) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.vagon = vagon;
    }

    public int getVagon() {
        return vagon;
    }

    public void setVagon(int vagon) {
        this.vagon = vagon;
    }

    @Override
    public void sirena() {
        System.out.println("voz svira: cu cu");
    }
}
