package DataGenerator.Interfaces;

public interface Entry {
    void trim();

    String toTrimmedCSVFormatString();

    String genSpaces();

    String toRawCSVFormatString();
}
