package dk.cosby;

public class Discography {

    private String name;
    private int recordCount = 0;

    public Discography(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    @Override
    public String toString() {
        return "Future Artist\n0 records";
    }
}
