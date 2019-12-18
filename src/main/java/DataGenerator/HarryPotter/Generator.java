package DataGenerator.HarryPotter;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private Faker faker;

    public Generator() {
        faker = new Faker();
    }

    private Entry genHeaderEntry() {
        Entry entry = new Entry();
        entry.setBook("book");
        entry.setCharacter("character");
        entry.setLocation("location");
        entry.setQuote("quote");
        return entry;
    }

    private Entry genOneEntry() {
        Entry entry = new Entry();
        entry.setBook(faker.harryPotter().book());
        entry.setCharacter(faker.harryPotter().character());
        entry.setLocation(faker.harryPotter().location());
        entry.setQuote(faker.harryPotter().quote());
        entry.trim();
        return entry;
    }

    public List<Entry> genNEntries(int n) {
        List<Entry> list = new ArrayList<>();
        list.add(genHeaderEntry());
        for (int i = 0; i < n; i++) {
            list.add(genOneEntry());
        }
        return list;
    }
}
