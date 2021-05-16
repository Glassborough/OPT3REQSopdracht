public class Titel {
    private String naam;
    private int filmOfSerie; // 0 = serie, 1 = film
    private Streamingsdienst staatOp;

    public Titel(String naam, Streamingsdienst staatOp) {
        this.naam = naam;
        this.staatOp = staatOp;
    }

    public Streamingsdienst getStaatOp() {
        return staatOp;
    }


    public String getNaam() {
        return naam;
    }
}
