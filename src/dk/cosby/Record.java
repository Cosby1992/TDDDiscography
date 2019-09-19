package dk.cosby;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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

    public void addTrack(Track t){

        tracks.add(t);
        playtime += t.getPlaytime();
        trackCount++;

    }

    @Override
    public String toString() {

        if(trackCount > 0){

            StringBuilder builder = new StringBuilder();

            String album = title + " [" + releaseDate.getYear() +
                    "-" + getMonthString() +
                    "-" + getDayString() + ", PT" + playtime/60 + "M" + playtime%60 + "S]";

            builder.append(album);

            String temp;

            for (int i = 1; i < tracks.size()+1; i++) {
                temp = "\n[" + i + "] " + tracks.get(i-1).toString();
                builder.append(temp);
            }

            return builder.toString();

        } else {
            return albumString();
        }

    }

    private String albumString(){

        return title + " [" + releaseDate.getYear() +
                "-" + getMonthString() +
                "-" + getDayString() + ", PT" + playtime + "S]";

    }

    private String getMonthString(){

        if(releaseDate.getMonthValue() < 10){
            return  "0" + releaseDate.getMonthValue();
        } else {
            return String.valueOf(releaseDate.getMonthValue());
        }

    }

    private String getDayString(){

        if(releaseDate.getDayOfMonth() < 10){
            return  "0" + releaseDate.getDayOfMonth();
        } else {
            return String.valueOf(releaseDate.getDayOfMonth());
        }

    }
}
