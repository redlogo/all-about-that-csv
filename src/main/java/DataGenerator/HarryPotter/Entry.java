package DataGenerator.HarryPotter;

import DataGenerator.Utilities.TrimmingUtilities;

public class Entry implements DataGenerator.Interfaces.Entry {
    private String book;
    private String character;
    private String location;
    private String quote;

    private TrimmingUtilities trimmingUtilities;

    public Entry() {
        trimmingUtilities = new TrimmingUtilities();
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public void trim() {
        book = trimmingUtilities.trim(book);
        character = trimmingUtilities.trim(character);
        location = trimmingUtilities.trim(location);
        quote = trimmingUtilities.trim(quote);
    }

    @Override
    public String toSimpleCSVFormatString() {
        return book + "," +
                character + "," +
                location + "," +
                quote;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "book='" + book + '\'' +
                ", character='" + character + '\'' +
                ", location='" + location + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
