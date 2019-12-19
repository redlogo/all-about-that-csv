import FileWriter.CSVWriter;
import Interfaces.Entry;

import java.util.ArrayList;
import java.util.List;

public class GenCSV {
    private CSVWriter csvWriter;

    GenCSV() {
        csvWriter = new CSVWriter();
    }

    public void genAddressBookTrimmed(int numOfEntries, String targetFilePath) {
        DataGenerator.AddressBook.Generator generator = new DataGenerator.AddressBook.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeTrimmedCSVWithEntries(list, targetFilePath);
    }

    public void genAddressBookRaw(int numOfEntries, String targetFilePath) {
        DataGenerator.AddressBook.Generator generator = new DataGenerator.AddressBook.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeRawCSVWithEntries(list, targetFilePath);
    }

    public void genHarryPotterTrimmed(int numOfEntries, String targetFilePath) {
        DataGenerator.HarryPotter.Generator generator = new DataGenerator.HarryPotter.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeTrimmedCSVWithEntries(list, targetFilePath);
    }

    public void genHarryPotterRaw(int numOfEntries, String targetFilePath) {
        DataGenerator.HarryPotter.Generator generator = new DataGenerator.HarryPotter.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeRawCSVWithEntries(list, targetFilePath);
    }
}
