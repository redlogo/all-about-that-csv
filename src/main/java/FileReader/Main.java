package FileReader;

import Utilities.PathManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        PathManager pathManager = new PathManager();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathManager.getTmp_testCSVFile1()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            Matcher matcher = Pattern.compile(",[ \t]*?\".*?\"[ \t]*?(,|$)").matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.start());
                System.out.println(matcher.end());
            }
        }
    }
}
