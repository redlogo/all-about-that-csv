import Utilities.PathManager;

public class Main {
    public static void main(String[] args) {
        PathManager pathManager = new PathManager();
        AboutCSV aboutCSV = new AboutCSV();

        aboutCSV.genCSV().genAddressBookRaw(10, pathManager.getOutputTestCSVFile1());
        aboutCSV.genCSV().genHarryPotterRaw(10, pathManager.getOutputTestCSVFile2());

        aboutCSV.readCSV().printCSV_toRaw(pathManager.getInputTestCSVFile1());
        aboutCSV.readCSV().printCSV_toCompact(pathManager.getInputTestCSVFile1());
        aboutCSV.readCSV().printCSV_toTabulated(pathManager.getInputTestCSVFile1());

        aboutCSV.convertCSV().convertCSV_toCompact(pathManager.getInputTestCSVFile1(), pathManager.getOutputTestCSVFile1());
        aboutCSV.convertCSV().convertCSV_toTabulated(pathManager.getInputTestCSVFile1(), pathManager.getOutputTestCSVFile2());
    }
}
