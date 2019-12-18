import Utilities.PathManager;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();
        AboutCSV aboutCSV = new AboutCSV();

        aboutCSV.genCSV().genAddressBookRaw(2000, pathManager.getTestCSVFile1());
        aboutCSV.genCSV().genHarryPotterRaw(2000, pathManager.getTestCSVFile2());
    }
}
