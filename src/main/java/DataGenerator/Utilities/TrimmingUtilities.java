package DataGenerator.Utilities;

public class TrimmingUtilities {

    public String trim(String s) {
        s = deleteLeadingAndTrailingSpaces(s);
        s = addDoubleQuoteToCommaCase(s);
        return s;
    }

    public String deleteLeadingAndTrailingSpaces(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < s.length() && (s.charAt(start) == ' ' || s.charAt(start) == '\t')) start++;
        while (end >= 0 && (s.charAt(end) == ' ' || s.charAt(end) == '\t')) end--;
        if (end < start) return "";
        return s.substring(start, end + 1);
    }

    public String addDoubleQuoteToCommaCase(String s) {
        boolean hasComma = false;
        for (char c : s.toCharArray())
            if (c == ',') {
                hasComma = true;
                break;
            }
        if (hasComma) {
            if (s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') return s;
            return "\"" + s + "\"";
        }
        return s;
    }
}
