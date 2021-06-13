public abstract class Titel {
    private String naam;
    private Streamingsdienst staatOp;

    public Titel(String naam, Streamingsdienst staatOp) {
        this.naam = naam;
        this.staatOp = staatOp;
//        staatOp.voegTitelToe(this);
    }

    public Streamingsdienst getStaatOp() {
        return staatOp;
    }

    public String getNaam() {
        return naam;
    }

    public void printInfo () {
        System.out.println(getNaam());
    }
}
