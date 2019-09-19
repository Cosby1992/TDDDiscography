package dk.cosby;

import org.junit.jupiter.api.Test;

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


        //playtime is measured in seconds. 10 minutes and 8 seconds = 608 seconds
        assertEquals(608, track.getPlaytime());

        assertEquals("And You and I", track.getTitle());

        assertFalse(track.isBonusTrack()); //assert false

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

        //playtime is measured in seconds. 4 minutes and 12 seconds = 252 seconds
        assertEquals(252, track.getPlaytime());

        assertEquals("America", track.getTitle());

        assertTrue(track.isBonusTrack()); //assert true

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

        assertEquals(0, record.getPlaytime());
        assertEquals(0, record.getTrackCount());
        assertEquals(RecordType.SINGLE, record.getType());
        assertEquals("Under Production", record.getTitle());

        assertEquals("Under Production [2074-10-06, PT0S]", record.toString());

    }

    /*
     *   4. An album (record) titled “Close to the Edge” released on 13 September 1972 containing both of the
     *   above-mentioned tracks has a playtime of 14 minutes 20 seconds and a track count of 2. It has a
     *   release date of 13 September 1972 and is of type album.
     *   It is displayed as “Close to the Edge [1972-09-13, PT14M20S]\n[1] And You and I [PT10M8S]\n[2]
     *   America [PT4M12S]”
     */
    @Test
    public void recordTest2(){

        Record record = new Record(RecordType.ALBUM, "Close to the Edge", 1972, 9, 13);
        record.addTrack(new Track("And You and I", 60*10+8, false));
        record.addTrack(new Track("America", 60*4+12, true));

        assertEquals(860, record.getPlaytime());
        assertEquals(2, record.getTrackCount());
        assertEquals(RecordType.ALBUM, record.getType());
        assertEquals("Close to the Edge [1972-09-13, PT14M20S]" +
                "\n[1] And You and I [PT10M8S]" +
                "\n[2] America [PT4M12S]", record.toString());



    }

    /*
     *   5. A discography by “Future Artist” including no albums has a record count of 0 and the artist name
     *   “Future Artist”.
     *   It is displayed as “Future Artist\n0 records”.
     *
     */
    @Test
    public void discographyTest1(){

        Discography discography = new Discography("Future Artist");

        assertEquals(0, discography.getRecordCount());
        assertEquals("Future Artist", discography.getArtistName());
        assertEquals("Future Artist\n0 records", discography.toString());

    }


    /*
     *   A discography by “Yes” including the above-mentioned album “Close to the Edge” has a record
     *   count of 1 and the artist name “Yes”.
     *   It is displayed as “Yes\n1 records\nClose to the Edge [1972-09-13, PT14M20S]\n[1] And You and I
     *   [PT10M8S]\n[2] America [PT4M12S]”.
     */
    @Test
    public void discographyTest2(){

        Discography discography = new Discography("Yes");


    }


}