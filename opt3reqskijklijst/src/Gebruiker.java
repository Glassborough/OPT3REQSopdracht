import java.util.ArrayList;

public class Gebruiker {
    private String naam;
    private ArrayList<Streamingsdienst> geabonneerdOp;

    public Gebruiker (){}


    public String getNaam() {
        return naam;
    }

    public ArrayList<Streamingsdienst> getGeabonneerdOp() {
        return geabonneerdOp;
    }
}
