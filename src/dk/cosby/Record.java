package dk.cosby;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Record {

    private RecordType type;
    private String title;
    private LocalDate releaseDate;
    private int trackCount = 0;
    private int playtime = 0;

    private ArrayList<Track> tracks;

    public Record(RecordType type, String title, int year, int month, int day) {
        this.type = type;
        this.title = title;
        this.releaseDate = LocalDate.of(year, month, day);
        tracks = new ArrayList<>();
    }

    public RecordType getType() {
        return type;
    }

    public void setType(RecordType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    @Override
    public String toString() {

        return title + " [" + releaseDate.getYear() +
                "-" + releaseDate.getMonth().getValue() +
                "-0" + releaseDate.getDayOfMonth() + ", PT" + playtime + "S]";

    }
}
