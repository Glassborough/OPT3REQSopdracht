import java.util.ArrayList;
import java.util.stream.Stream;

public class Zoekopdracht {
    private Gebruiker gedaanDoor;
    private ArrayList<Streamingsdienst> zoekIn;
    private ArrayList <Titel> geeftTerug;

    public Zoekopdracht(){}


    public Gebruiker getGedaanDoor() {
        return gedaanDoor;
    }

    public ArrayList<Streamingsdienst> getZoekIn() {
        return zoekIn;
    }

    public ArrayList<Titel> getGeeftTerug() {
        return geeftTerug;
    }

    public boolean titelWelOfNiet(Titel titel) {
        return false;
    }
}
