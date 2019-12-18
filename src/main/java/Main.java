import DataGenerator.AddressBook.Entry;
import DataGenerator.AddressBook.Generator;
import FileWriter.CSVWriter;
import Utilities.PathManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();

        Generator generator = new Generator();
        List<Entry> list = generator.genNEntries(1000);
        CSVWriter csvWriter = new CSVWriter();
        csvWriter.writeSimpleCSVWithEntries(list, pathManager.getTestCSVFile());

    }
}
