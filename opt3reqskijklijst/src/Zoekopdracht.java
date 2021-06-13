import java.util.ArrayList;

public class Zoekopdracht {
    private Gebruiker gedaanDoor;
    private ArrayList<Streamingsdienst> zoekIn;
    private ArrayList <Titel> geeftTerug;

    public Zoekopdracht(Gebruiker gedaanDoor){
        this.gedaanDoor = gedaanDoor;
        zoekIn = new ArrayList<>(); //moet nog gevuld worden met waar gebr. op is geabonneerd, en waar hij verder nog in wil zoeken
        zoekIn.add(gedaanDoor.getGeabonneerdOp());
        geeftTerug = new ArrayList<>();
    }

    public Gebruiker getGedaanDoor() {
        return gedaanDoor;
    }

    public ArrayList<Streamingsdienst> getZoekIn() {
        return zoekIn;
    }

    public void zoekOokIn(Streamingsdienst dienst) {
        zoekIn.add(dienst);
    }

    public ArrayList<Titel> getGeeftTerug() {
        return geeftTerug;
    }

    public int voerZoekOpdrachtUit(char zoekletter) {
        int count = 0;
        for (Streamingsdienst dienst : zoekIn) {
            for (Titel titel : dienst.getTitels()) {
                if (titelWelOfNiet(titel, zoekletter)) {
                    geeftTerug.add(titel);
                    count++;
                }
            }
        }
        if (geeftTerug.size() < 20) {
            System.out.println("U zoekt op letter " + zoekletter + " in: ");
            for (Streamingsdienst dienst : zoekIn) {
                System.out.println(dienst.getNaam());
            }
            System.out.println("Dat geeft de volgende resultaten terug: ");
            System.out.println();



            for (Titel titel : geeftTerug) {
                System.out.println(titel.getNaam());
            }
            System.out.println();
            geeftTerug.clear();
        }
        else {
            count = -1;
            System.out.println("Wat is de tweede letter van de titel?");
            System.out.println();
        }
        return count;
    }

    public boolean titelWelOfNiet(Titel titel, char letterGezocht) {
        boolean aOfB = false;
        boolean c = false;
        for (Streamingsdienst dienst : zoekIn) {
            if (dienst.getNaam().equals(titel.getStaatOp().getNaam())) {
                aOfB = true;
            }
        }
        if (letterGezocht == (titel.getNaam().charAt(0))) {
            c = true;

        }
        return (aOfB && c);
    }
}
