import FileWriter.CSVWriter;
import Interfaces.Entry;

import java.util.ArrayList;
import java.util.List;

public class GenCSV {
    private CSVWriter csvWriter;

    GenCSV() {
        csvWriter = new CSVWriter();
    }

    public void genAddressBook_toCompact(int numOfEntries, String targetFilePath) {
        DataGenerator.AddressBook.Generator generator = new DataGenerator.AddressBook.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeTrimmedCSVWithEntries(list, targetFilePath);
    }

    public void genAddressBook_toRaw(int numOfEntries, String targetFilePath) {
        DataGenerator.AddressBook.Generator generator = new DataGenerator.AddressBook.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeRawCSVWithEntries(list, targetFilePath);
    }

    public void genHarryPotter_toCompact(int numOfEntries, String targetFilePath) {
        DataGenerator.HarryPotter.Generator generator = new DataGenerator.HarryPotter.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeTrimmedCSVWithEntries(list, targetFilePath);
    }

    public void genHarryPotter_toRaw(int numOfEntries, String targetFilePath) {
        DataGenerator.HarryPotter.Generator generator = new DataGenerator.HarryPotter.Generator();
        List<Entry> list = new ArrayList<>(generator.genNEntries(numOfEntries));
        csvWriter.writeRawCSVWithEntries(list, targetFilePath);
    }
}
