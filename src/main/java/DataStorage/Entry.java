package DataStorage;

import Utilities.TrimmingUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entry implements Interfaces.Entry {
    private List<String> contents;
    private List<String> trimmedContents;

    private TrimmingUtilities trimmingUtilities;

    public Entry() {
        contents = new ArrayList<>();
        trimmedContents = new ArrayList<>();
        trimmingUtilities = new TrimmingUtilities();
    }

    public void addToContent(String[] strings) {
        for (String s : strings) {
            contents.add(s);
            trimmedContents.add(trimmingUtilities.trim(s));
        }
    }

    public int size() {
        return contents.size();
    }

    @Override
    public String genSpaces() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int genCount = random.nextInt(3);
        for (int i = 0; i < genCount; i++) {
            int genType = random.nextInt(2);
            if (genType == 0) {
                stringBuilder.append(" ");
            } else {
                stringBuilder.append("\t");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toTrimmedCSVFormatString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < trimmedContents.size(); i++) {
            stringBuilder.append(trimmedContents.get(i));
            if (i != trimmedContents.size() - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toRawCSVFormatString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < contents.size(); i++) {
            stringBuilder.append(contents.get(i));
            if (i != contents.size() - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder.toString();
    }
}
