import org.junit.Test;

import static org.junit.Assert.*;

public class ZoekopdrachtTest2 {

    // maak twee streamingsdiensten aan
    Streamingsdienst netflix = new Streamingsdienst("netflix");
    Streamingsdienst videoland = new Streamingsdienst("videoland");
    Streamingsdienst amazonPrime = new Streamingsdienst("amazon prime");
    // maak gebruiker aan die op netflix is geabonneerd
    Gebruiker jan = new Gebruiker(netflix);


    Titel batmanBegins = new Titel("Batman Begins", videoland);
    Titel babyDriver = new Titel("Baby Driver", amazonPrime);
    // maak nieuwe zoekopdracht aan
    Zoekopdracht zoek = new Zoekopdracht(jan);



    @Test
    public void Eq1Test(){ // test voor waardes 0,1,2,18,19,20

        assertEquals(0, zoek.voerZoekOpdrachtUit('B')); // 0
        // maak nieuwe titel aan met letter B
        netflix.voegTitelToe(new Titel("B testTitel 1", netflix));
        assertEquals(1, zoek.voerZoekOpdrachtUit('B')); // 1
        // maak nieuwe titel aan met letter B
        netflix.voegTitelToe(new Titel("B testTitel 2", netflix));
        assertEquals(2, zoek.voerZoekOpdrachtUit('B')); // 2

        // maak 16 nieuwe titels aan met letter B
        for (int i =3; i<19;i++) {
            netflix.voegTitelToe(new Titel("B testTitel " + i, netflix));
        }
        assertEquals(18, zoek.voerZoekOpdrachtUit('B'));

        // maak nieuwe titel aan met letter B
        netflix.voegTitelToe(new Titel("B testTitel 19", netflix));
        assertEquals(19, zoek.voerZoekOpdrachtUit('B'));

        // maak nieuwe titel aan met letter B
        netflix.voegTitelToe(new Titel("B testTitel 20", netflix));
        assertEquals(-1,  zoek.voerZoekOpdrachtUit('B'));


    }

    @Test
    public void Eq2Test () { // waarde 21 (19 en 20 horen ook bij Eq2 maar zijn al getest bij Eq1)
        // voeg 21 titels toe
        for (int i =1; i<22;i++) {
            netflix.voegTitelToe(new Titel("B testTitel " + i, netflix));
        }
        assertEquals(-1, zoek.voerZoekOpdrachtUit('B'));

    }

}