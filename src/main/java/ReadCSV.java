import DataStorage.Entry;
import FileReader.CSVReader;

import java.util.List;

public class ReadCSV {
    private CSVReader csvReader;

    public ReadCSV() {
        csvReader = new CSVReader();
    }

    public void readCSVWithHeader(String targetFilePath) {
        List<Entry> res = csvReader.readCSVWithHeader(targetFilePath);
        for (Entry entry : res) {
            System.out.println(entry);
        }
    }
}
