package DataStorage;

import Utilities.TrimmingUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entry implements Interfaces.Entry {
    private List<String> contents;
    private List<String> trimmedContents;
    private List<String> tabulatedContents;

    private TrimmingUtilities trimmingUtilities;

    public Entry() {
        contents = new ArrayList<>();
        trimmedContents = new ArrayList<>();
        tabulatedContents = new ArrayList<>();
        trimmingUtilities = new TrimmingUtilities();
    }

    public int size() {
        return contents.size();
    }

    public List<String> getContents() {
        return contents;
    }

    public List<String> getTrimmedContents() {
        return trimmedContents;
    }

    public void addToContents(List<String> strings) {
        contents = strings;
        for (String s : contents) {
            trimmedContents.add(trimmingUtilities.trim(s));
        }
    }

    public void tabulateContents(List<Integer> widths) {
        for (int i = 0; i < widths.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" ");
            if (size() - 1 >= i) {
                stringBuilder.append(trimmedContents.get(i));
                for (int j = 0; j < widths.get(i) - trimmedContents.get(i).length(); j++) {
                    stringBuilder.append(" ");
                }
            } else {
                for (int j = 0; j < widths.get(i); j++) {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append(" ");
            tabulatedContents.add(stringBuilder.toString());
        }
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

    @Override
    public String toTabulatedCSVFormatString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tabulatedContents.size(); i++) {
            stringBuilder.append(tabulatedContents.get(i));
            if (i != tabulatedContents.size() - 1) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Entry{" +
                // "contents=" + contents +
                " trimmedContents=" + trimmedContents +
                '}';
    }
}
