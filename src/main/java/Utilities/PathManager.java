package Utilities;

public class PathManager {
    private String systemUserDir;
    private String testCSVFile1;
    private String testCSVFile2;

    public PathManager() {
        systemUserDir = genSystemUserDir();
        testCSVFile1 = systemUserDir + "/files/output/testCSVFile1.csv";
        testCSVFile2 = systemUserDir + "/files/output/testCSVFile2.csv";
    }

    private String genSystemUserDir() {
        return System.getProperty("user.dir");
    }

    public String getTestCSVFile1() {
        return testCSVFile1;
    }

    public String getTestCSVFile2() {
        return testCSVFile2;
    }
}
