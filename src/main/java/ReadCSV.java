import DataStorage.Entry;
import FileReader.CSVReader;

import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    private CSVReader csvReader;

    public ReadCSV() {
        csvReader = new CSVReader();
    }

    public void printCSV_toTabulated(String targetFilePath) {
        System.out.println("\nPrint CSV to Tabulated Format from: " + targetFilePath);
        System.out.println("-------------start---------------");
        List<Entry> res = csvReader.parseCSV(targetFilePath);
        // get all cols max widths
        List<Integer> widths = new ArrayList<>();
        for (Entry entry : res) {
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
        for (Entry entry : res) {
            entry.tabulateContents(widths);
        }
        // print
        for (Entry entry : res) {
            System.out.println(entry.toTabulatedCSVFormatString());
        }
        System.out.println("--------------end----------------");
        System.out.println("Print CSV to Tabulated Format Done\n");
    }

    public void printCSV_toCompact(String targetFilePath) {
        System.out.println("\nPrint CSV to Compact Format from: " + targetFilePath);
        System.out.println("-------------start---------------");
        List<Entry> res = csvReader.parseCSV(targetFilePath);
        for (Entry entry : res) {
            System.out.println(entry.toTrimmedCSVFormatString());
        }
        System.out.println("--------------end----------------");
        System.out.println("Print CSV to Compact Format Done\n");
    }

    public void printCSV_toRaw(String targetFilePath) {
        System.out.println("\nPrint CSV as Raw Format from: " + targetFilePath);
        System.out.println("-------------start---------------");
        List<Entry> res = csvReader.parseCSV(targetFilePath);
        for (Entry entry : res) {
            System.out.println(entry.toRawCSVFormatString());
        }
        System.out.println("--------------end----------------");
        System.out.println("Print CSV as Raw Format Done\n");
    }

}
