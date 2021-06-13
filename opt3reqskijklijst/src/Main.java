import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        Streamingsdienst netflix = new Streamingsdienst("netflix");
        Streamingsdienst videoland = new Streamingsdienst("videoland");
        Gebruiker emma = new Gebruiker(netflix);
        netflix.printInfoAlleTitels();

        Zoekopdracht zoek = new Zoekopdracht(emma);
        Scanner scanner = new Scanner(System.in);
        zoek.zoekOokIn(videoland);
        System.out.println("Op welke letter wil je zoeken?");

        char zoekletter = scanner.nextLine().charAt(0);
        zoek.voerZoekOpdrachtUit(zoekletter);

//        zoek.voerZoekOpdrachtUit(zoekletter);
    }
}
