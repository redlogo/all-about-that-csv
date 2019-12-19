package FileReader;

import DataStorage.Entry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSVReader {

    public CSVReader() {

    }

    public List<Entry> readCSVWithHeader(String path) {
        List<Entry> res = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                Matcher matcher = Pattern.compile(",[ \t]*?\".*?\"[ \t]*?(,|$)").matcher(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
