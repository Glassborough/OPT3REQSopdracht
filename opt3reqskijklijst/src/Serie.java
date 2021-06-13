public class Serie extends Titel {

    private int aantalSeizoenen;

    public Serie(String naam, Streamingsdienst staatOp, int aantalSeizoenen) {
        super(naam, staatOp);
        this.aantalSeizoenen = aantalSeizoenen;
    }

    @Override
    public void printInfo () {
        System.out.println(getNaam() );
        System.out.println("Aantal seizoenen: " + getAantalSeizoenen());
    }

    public int getAantalSeizoenen() {
        return aantalSeizoenen;
    }
}
