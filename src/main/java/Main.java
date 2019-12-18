import DataGenerator.Interfaces.Entry;
import FileWriter.CSVWriter;
import Utilities.PathManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();
        CSVWriter csvWriter = new CSVWriter();
        DataGenerator.AddressBook.Generator generator1 = new DataGenerator.AddressBook.Generator();
        DataGenerator.HarryPotter.Generator generator2 = new DataGenerator.HarryPotter.Generator();

        List<Entry> list1 = new ArrayList<>(generator1.genNEntries(1000));
        csvWriter.writeSimpleCSVWithEntries(list1, pathManager.getTestCSVFile1());

        List<Entry> list2 = new ArrayList<>(generator2.genNEntries(1000));
        csvWriter.writeSimpleCSVWithEntries(list2, pathManager.getTestCSVFile2());
    }
}
