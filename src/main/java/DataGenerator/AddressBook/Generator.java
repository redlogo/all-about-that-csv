package DataGenerator.AddressBook;

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
        entry.setFirstName(faker.name().firstName());
        entry.setLastName(faker.name().lastName());
        entry.setPhoneNumber(faker.phoneNumber().phoneNumber());
        entry.setStreetName(faker.address().streetName());
        entry.setCity(faker.address().city());
        entry.setState(faker.address().state());
        entry.setZipCode(faker.address().zipCode());
        entry.setCountry(faker.address().country());
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
