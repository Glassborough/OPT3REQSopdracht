import java.util.ArrayList;

public class Streamingsdienst {
    private String naam;
    private ArrayList<Titel> heeftTitels;

    public Streamingsdienst(String naam){
        this.naam = naam;
        heeftTitels = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void voegTitelToe(Titel titel) {
        heeftTitels.add(titel);
    }

    public ArrayList<Titel> getHeeftTitels() {
        return heeftTitels;
    }
}


