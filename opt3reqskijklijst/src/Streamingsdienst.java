import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Streamingsdienst {
    private String naam;
    private ArrayList<Titel> titels;

    public Streamingsdienst(String naam){
        this.naam = naam;
        titels = new ArrayList<>();
        vulSeries();
        vulFilms();
    }

    public void vulFilms () {

        for (String naam : Uitlezer.getInstance().leesFileUit(getNaam()+".txt")) {
            titels.add(new Film(naam, this));
        }

    }

    public void vulSeries() {
        ArrayList<String>  list = new ArrayList<> ();

        for (String teruggave : Uitlezer.getInstance().leesFileUit(getNaam()+"Series.txt")) {
            list.add(teruggave);
        }

        for (int i =0; i <list.size(); i+=2) {

            int seizoenen = parseInt(list.get(i+1));
            titels.add(new Serie(list.get(i), this, seizoenen));
        }


    }

    public void printInfoAlleTitels() {
        System.out.println("Op " + getNaam() + " staan momenteel de volgende titels:");
        System.out.println();
        for (Titel titel : titels) {
            titel.printInfo();
            System.out.println();
        }
    }

    public String getNaam() {
        return naam;
    }

    public void voegTitelToe(Titel titel) {
        titels.add(titel);
    }

    public ArrayList<Titel> getTitels() {
        return titels;
    }
}


