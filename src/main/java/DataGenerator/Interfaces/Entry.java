package DataGenerator.Interfaces;

public interface Entry {
    void trim();

    String toSimpleCSVFormatString();

    String genSpaces();

    String toRawCSVFormatString();
}
