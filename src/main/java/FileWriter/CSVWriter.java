package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    public CSVWriter() {

    }

    public void writeSimpleCSVWithAddressBookEntries(List<DataGenerator.AddressBook.Entry> list, String path) {
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            for (DataGenerator.AddressBook.Entry entry : list) {
                fileWriter.write(entry.toSimpleCSVFormatString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeSimpleCSVWithHarryPotterEntries(List<DataGenerator.HarryPotter.Entry> list, String path) {
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            for (DataGenerator.HarryPotter.Entry entry : list) {
                fileWriter.write(entry.toSimpleCSVFormatString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
