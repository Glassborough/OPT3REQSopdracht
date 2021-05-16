import java.util.ArrayList;

public class Gebruiker {
    private String naam;
    private Streamingsdienst geabonneerdOp;

    public Gebruiker (Streamingsdienst geabonneerdOp){
        this.geabonneerdOp = geabonneerdOp;
    }


    public String getNaam() {
        return naam;
    }

    public Streamingsdienst getGeabonneerdOp() {
        return geabonneerdOp;
    }
}
