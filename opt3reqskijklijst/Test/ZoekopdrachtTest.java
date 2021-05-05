import org.junit.Test;

import static org.junit.Assert.*;

public class ZoekopdrachtTest {

    Zoekopdracht zoek = new Zoekopdracht();
    Titel titel = new Titel();

    @Test
    public void initTest() {
        assertFalse(zoek.titelWelOfNiet(titel));
    }


}