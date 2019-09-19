package dk.cosby;

public class Track {

    private String title;
    private int playtime; //playtime in seconds
    private boolean isBonusTrack;

    public Track(String title, int playtime, boolean isBonusTrack) {
        this.title = title;
        this.playtime = playtime;
        this.isBonusTrack = isBonusTrack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public boolean isBonusTrack() {
        return isBonusTrack;
    }

    public void setBonusTrack(boolean bonusTrack) {
        isBonusTrack = bonusTrack;
    }

    @Override
    public String toString() {

        return title + " [PT" + playtime/60 + "M" + playtime%60 + "S]";

    }
}
