import Utilities.PathManager;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();
        AboutCSV aboutCSV = new AboutCSV();

        aboutCSV.genCSV().genAddressBookRaw(1000, pathManager.getOutputTestCSVFile1());
        aboutCSV.genCSV().genHarryPotterRaw(1000, pathManager.getOutputTestCSVFile2());

        aboutCSV.readCSV().readCSVWithHeader(pathManager.getTmp_testCSVFile1());
    }
}
