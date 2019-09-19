package dk.cosby;

import java.util.ArrayList;

public class Discography {

    private String artistName;
    private int recordCount = 0;
    private ArrayList<Record> records;



    Discography(String artistName) {
        this.artistName = artistName;
        records = new ArrayList<>();
    }

    String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    void addRecord(Record record){
        records.add(record);
        recordCount++;
    }

    @Override
    public String toString() {
        if(recordCount > 0){

            StringBuilder builder = new StringBuilder();

            String discString = artistName + "\n" + recordCount + " records\n";

            builder.append(discString);

            for (int i = 1; i < records.size()+1; i++) {
                builder.append(records.get(i-1).toString());
            }

            return builder.toString();

        } else {
            return "Future Artist\n0 records";
        }

    }
}
