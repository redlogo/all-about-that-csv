package FileWriter;

import Interfaces.Entry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    public CSVWriter() {

    }

    public void writeTrimmedCSVWithEntries(List<Entry> list, String path) {
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            for (Entry entry : list) {
                fileWriter.write(entry.toTrimmedCSVFormatString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeRawCSVWithEntries(List<Entry> list, String path) {
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            for (Entry entry : list) {
                fileWriter.write(entry.toRawCSVFormatString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
