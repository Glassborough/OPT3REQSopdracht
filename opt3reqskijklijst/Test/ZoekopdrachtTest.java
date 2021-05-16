import org.junit.Test;

import static org.junit.Assert.*;

public class ZoekopdrachtTest {




    // maak twee streamingsdiensten aan
    Streamingsdienst netflix = new Streamingsdienst("netflix");
    Streamingsdienst videoland = new Streamingsdienst("videoland");
    Streamingsdienst amazonPrime = new Streamingsdienst("amazon prime");
    // maak gebruiker aan die op netflix is geabonneerd
    Gebruiker jan = new Gebruiker(netflix);
    // maak nieuwe titel aan met letter B die op netflix staat
    Titel breakingBad = new Titel("Breaking Bad", netflix);
    // maak nieuwe titel aan met letter B die op videoland staat
    Titel batmanBegins = new Titel("Batman Begins", videoland);
    // maak nieuwe titel aan met letter B die op prime staat
    Titel babyDriver = new Titel("Baby Driver", amazonPrime);
    // maak nieuwe zoekopdracht aan
    Zoekopdracht zoek = new Zoekopdracht(jan);



    @Test
    public void test001() { // 001 betekent: titel staat NIET op geabonneerde dienst, NIET in dienst waarin ook wordt gezocht, begint WEL met zelfde letter
        zoek.zoekOokIn(videoland);
         assertFalse (zoek.titelWelOfNiet(babyDriver, 'B'));
    }

    @Test
    public void test011 () { // 011 betekent: titel staat NIET op geabonneerde dienst, WEL in dienst waarin ook wordt gezocht, begint WEL met zelfde letter
        zoek.zoekOokIn(videoland);
        assertTrue(zoek.titelWelOfNiet(batmanBegins, 'B'));
    }

    @Test
    public void test010 () { // 010 betekent: titel staat NIET op geabonneerde dienst, WEL in dienst waarin ook wordt gezocht, begint NIET met zelfde letter
        zoek.zoekOokIn(videoland);
        assertFalse(zoek.titelWelOfNiet(batmanBegins, 'C'));
    }

    @Test
    public void test101(){ // // 101 betekent: titel staat WEL op geabonneerde dienst, NIET in dienst waarin ook wordt gezocht, begint WEL met zelfde letter
        zoek.zoekOokIn(amazonPrime);
        assertTrue(zoek.titelWelOfNiet(breakingBad, 'B'));

    }


}