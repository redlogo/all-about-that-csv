import FileWriter.CSVWriter;
import Utilities.PathManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();

        DataGenerator.AddressBook.Generator generator1 = new DataGenerator.AddressBook.Generator();
        List<DataGenerator.AddressBook.Entry> list1 = generator1.genNEntries(1000);
        CSVWriter csvWriter1 = new CSVWriter();
        csvWriter1.writeSimpleCSVWithAddressBookEntries(list1, pathManager.getTestCSVFile1());

        DataGenerator.HarryPotter.Generator generator2 = new DataGenerator.HarryPotter.Generator();
        List<DataGenerator.HarryPotter.Entry> list2 = generator2.genNEntries(1000);
        CSVWriter csvWriter2 = new CSVWriter();
        csvWriter2.writeSimpleCSVWithHarryPotterEntries(list2, pathManager.getTestCSVFile2());
    }
}
