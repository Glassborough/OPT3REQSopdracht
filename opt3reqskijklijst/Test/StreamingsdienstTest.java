import org.junit.Test;

import static org.junit.Assert.*;

public class StreamingsdienstTest {



    @Test
    public void vulTitelsTest() {
        Streamingsdienst netflix = new Streamingsdienst("netflix");
        assertEquals(9, netflix.getTitels().size());

        Streamingsdienst videoland = new Streamingsdienst("videoland");
        assertEquals(0, videoland.getTitels().size());


    }


}