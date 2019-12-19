package Utilities;

public class PathManager {
    private String systemUserDir;
    private String input_testCSVFile1;
    private String input_testCSVFile2;
    private String output_testCSVFile1;
    private String output_testCSVFile2;
    private String tmp_testCSVFile1;

    public PathManager() {
        systemUserDir = genSystemUserDir();
        input_testCSVFile1 = systemUserDir + "/files/input/testCSVFile1.csv";
        input_testCSVFile2 = systemUserDir + "/files/input/testCSVFile2.csv";
        output_testCSVFile1 = systemUserDir + "/files/output/testCSVFile1.csv";
        output_testCSVFile2 = systemUserDir + "/files/output/testCSVFile2.csv";
        tmp_testCSVFile1 = systemUserDir + "/files/tmp/tmp.csv";
    }

    private String genSystemUserDir() {
        return System.getProperty("user.dir");
    }

    public String getInputTestCSVFile1() {
        return input_testCSVFile1;
    }

    public String getInputTestCSVFile2() {
        return input_testCSVFile2;
    }

    public String getOutputTestCSVFile1() {
        return output_testCSVFile1;
    }

    public String getOutputTestCSVFile2() {
        return output_testCSVFile2;
    }

    public String getTmp_testCSVFile1() {
        return tmp_testCSVFile1;
    }
}
