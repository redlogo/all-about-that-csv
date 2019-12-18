import DataGenerator.Interfaces.Entry;
import FileWriter.CSVWriter;

import java.util.ArrayList;
import java.util.List;

public class DataGen {
    private CSVWriter csvWriter;

    DataGen() {
        csvWriter = new CSVWriter();
    }

    public void writeAddressBookSimpleCSV(int numOfEntries, String targetFilePath) {
        DataGenerator.AddressBook.Generator generator = new DataGenerator.AddressBook.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeSimpleCSVWithEntries(list, targetFilePath);
    }

    public void writeAddressBookRawCSV(int numOfEntries, String targetFilePath) {
        DataGenerator.AddressBook.Generator generator = new DataGenerator.AddressBook.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeRawCSVWithEntries(list, targetFilePath);
    }

    public void writeHarryPotterSimpleCSV(int numOfEntries, String targetFilePath) {
        DataGenerator.HarryPotter.Generator generator = new DataGenerator.HarryPotter.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeSimpleCSVWithEntries(list, targetFilePath);
    }

    public void writeHarryPotterRawCSV(int numOfEntries, String targetFilePath) {
        DataGenerator.HarryPotter.Generator generator = new DataGenerator.HarryPotter.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeRawCSVWithEntries(list, targetFilePath);
    }
}
