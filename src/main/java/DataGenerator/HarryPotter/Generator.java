package DataGenerator.HarryPotter;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private Faker faker;

    public Generator() {
        faker = new Faker();
    }

    public Entry genOneEntry() {
        Entry entry = new Entry();
        faker.harryPotter().book();
        faker.harryPotter().character();
        faker.harryPotter().location();
        faker.harryPotter().quote();
        entry.setBook(faker.harryPotter().book());
        entry.setCharacter(faker.harryPotter().character());
        entry.setLocation(faker.harryPotter().location());
        entry.setQuote(faker.harryPotter().quote());
        entry.trim();
        return entry;
    }

    public List<Entry> genNEntries(int n) {
        List<Entry> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(genOneEntry());
        }
        return list;
    }
}
