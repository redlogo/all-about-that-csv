package Utilities;

public class PathManager {
    private String systemUserDir;
    private String testCSVFile;

    public PathManager() {
        systemUserDir = genSystemUserDir();
        testCSVFile = systemUserDir + "/files/output/testCSVFile.csv";
    }

    private String genSystemUserDir() {
        return System.getProperty("user.dir");
    }

    public String getTestCSVFile() {
        return testCSVFile;
    }
}
