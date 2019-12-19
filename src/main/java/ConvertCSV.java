import FileReader.CSVReader;
import FileWriter.CSVWriter;
import Interfaces.Entry;

import java.util.ArrayList;
import java.util.List;

public class ConvertCSV {
    private CSVReader csvReader;
    private CSVWriter csvWriter;

    public ConvertCSV() {
        csvReader = new CSVReader();
        csvWriter = new CSVWriter();
    }

    public void convertCSV_toCompact(String fromFilePath, String toFilePath) {
        System.out.println("Convert CSV to Compact Format from: " + fromFilePath);
        System.out.println("                                to: " + toFilePath);
        List<Entry> res = new ArrayList<>(csvReader.parseCSV(fromFilePath));
        csvWriter.writeTrimmedCSVWithEntries(res, toFilePath);
        System.out.println("Convert CSV to Compact Format Done");
    }

    public void convertCSV_toTabulated(String fromFilePath, String toFilePath) {
        System.out.println("Convert CSV to Tabulated Format from: " + fromFilePath);
        System.out.println("                                  to: " + toFilePath);
        List<DataStorage.Entry> res = csvReader.parseCSV(fromFilePath);
        // get all cols max widths
        List<Integer> widths = new ArrayList<>();
        for (DataStorage.Entry entry : res) {
            List<String> trimmedContents = entry.getTrimmedContents();
            for (int i = 0; i < trimmedContents.size(); i++) {
                int len = trimmedContents.get(i).length();
                if (widths.size() - 1 < i) {
                    widths.add(len);
                } else {
                    widths.set(i, Math.max(widths.get(i), len));
                }
            }
        }
        // tabulate each entry
        for (DataStorage.Entry entry : res) {
            entry.tabulateContents(widths);
        }
        List<Entry> finals = new ArrayList<>(res);
        csvWriter.writeTabulatedCSVWithEntries(finals, toFilePath);
        System.out.println("Convert CSV to Tabulated Format Done");
    }
}
