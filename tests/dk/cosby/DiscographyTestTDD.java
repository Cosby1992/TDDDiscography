package dk.cosby;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DiscographyTestTDD {

    /*
     *  Testing if test class is running correctly
     */

    @Test
    public void testOK(){
        String s = "TDD";
        assertEquals("TDD", s);
    }

    /*
     *   1. A 10 minute 8 second track titled “And You and I” has a playtime of 10 minutes 8 seconds, a title of
     *   “And You and I” and is not a bonus track.
     *   It is displayed as “And You and I [PT10M8S]”.
     */

    @Test
    public void trackTest1(){

        Track track = new Track("And You and I", 60*10+8, false);

        assertEquals("And You and I [PT10M8S]", track.toString());

    }

    /*
     *   2. A 4 minute 12 second bonus track titled “America” has a playtime of 4 minutes 12 seconds, a title
     *   of “America” and is a bonus track.
     *   It is displayed as “America [PT4M12S]”.
     */

    @Test
    public void trackTest2(){

        Track track = new Track("America", 60*4+12, true);

        assertEquals("America [PT4M12S]", track.toString());

    }

    /*
     *   3. A single (record) titled “Under Production” with a release date of 6 October 2074 containing no
     *   tracks has a title of “Under Production”, a playtime of 0 seconds and a track count of 0. It has a
     *   release date of 6 October 2074 and is of type single.
     *   It is displayed as “Under Production [2074-10-06, PT0S]”.
     */

    @Test
    public void recordTest1(){


        Record record = new Record(RecordType.SINGLE, "Under Production", 2074, 10, 6);

        assertEquals("Under Production [2074-10-06, PT0S]", record.toString());

    }


}