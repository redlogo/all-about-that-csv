import FileReader.CSVReader;

public class ReadCSV {
    private CSVReader csvReader;

    public ReadCSV() {
        csvReader = new CSVReader();
    }

    public void readCSVWithHeader(String targetFilePath) {
        csvReader.readCSVWithHeader(targetFilePath);
    }
}
