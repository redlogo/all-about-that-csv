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

    public List<Entry> parseCSV(String path) {
        List<Entry> res = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // special ," ", patterns
                Matcher specialMatcher = Pattern.compile(",[ \t]*?\".*?\"[ \t]*?(,|$)").matcher(line);
                List<List<Integer>> specials = new ArrayList<>();
                while (specialMatcher.find()) {
                    List<Integer> list = new ArrayList<>();
                    list.add(specialMatcher.start());
                    list.add(specialMatcher.end());
                    specials.add(list);
                    // System.out.println(list);
                }
                // all , positions
                List<Integer> normals = new ArrayList<>();
                for (int i = 0; i < line.length(); i++) if (line.charAt(i) == ',') normals.add(i);
                // System.out.println(normals);
                // merge specials and normals
                List<Integer> finals = new ArrayList<>();
                for (int normal : normals) {
                    boolean skip = false;
                    for (List<Integer> special : specials) {
                        if (normal > special.get(0) && normal < special.get(1) - 1) {
                            skip = true;
                            break;
                        }
                    }
                    if (!skip) finals.add(normal);
                }
                // System.out.println(finals);
                // create substrings
                List<String> list = new ArrayList<>();
                for (int i = 0; i < finals.size(); i++) {
                    if (i == 0) {
                        list.add(line.substring(0, finals.get(i)));
                    } else {
                        list.add(line.substring(finals.get(i - 1) + 1, finals.get(i)));
                    }
                    if (i == finals.size() - 1) {
                        list.add(line.substring(finals.get(i) + 1));
                    }
                }
                // create Entry
                Entry entry = new Entry();
                entry.addToContents(list);
                // add to res
                res.add(entry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
