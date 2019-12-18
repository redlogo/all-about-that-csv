import Utilities.PathManager;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();
        AatCSV aatCSV = new AatCSV();

        aatCSV.dataGen().writeAddressBookSimpleCSV(2000, pathManager.getTestCSVFile1());
        aatCSV.dataGen().writeHarryPotterSimpleCSV(2000, pathManager.getTestCSVFile2());
    }
}
