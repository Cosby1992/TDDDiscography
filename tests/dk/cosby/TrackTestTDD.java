package dk.cosby;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackTestTDD {

    @Test
    public void testOK(){
        String s = "TDD";
        assertEquals("TDD", s);
    }

    /*
        1. A 10 minute 8 second track titled “And You and I” has a playtime of 10 minutes 8 seconds, a title of
        “And You and I” and is not a bonus track.
        It is displayed as “And You and I [PT10M8S]”.
     */

    @Test
    public void trackTest1(){

        Track track = new Track("And You and I", 60*10+8, false);

        assertEquals("And You and I [PT10M8S]", track.toString());

    }

    /*
        2. A 4 minute 12 second bonus track titled “America” has a playtime of 4 minutes 12 seconds, a title
        of “America” and is a bonus track.
        It is displayed as “America [PT4M12S]”.
     */

    @Test
    public void trackTest2(){

        Track track = new Track("America", 60*4+12, true);

        assertEquals("America [PT4M12S]", track.toString());

    }

}