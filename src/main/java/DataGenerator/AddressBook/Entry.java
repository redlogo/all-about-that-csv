package DataGenerator.AddressBook;

import Utilities.TrimmingUtilities;

import java.util.Random;

public class Entry implements DataGenerator.Interfaces.Entry {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    private TrimmingUtilities trimmingUtilities;

    public Entry() {
        trimmingUtilities = new TrimmingUtilities();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void trim() {
        firstName = trimmingUtilities.trim(firstName);
        lastName = trimmingUtilities.trim(lastName);
        phoneNumber = trimmingUtilities.trim(phoneNumber);
        streetName = trimmingUtilities.trim(streetName);
        city = trimmingUtilities.trim(city);
        state = trimmingUtilities.trim(state);
        zipCode = trimmingUtilities.trim(zipCode);
        country = trimmingUtilities.trim(country);
    }

    @Override
    public String toTrimmedCSVFormatString() {
        return firstName + "," +
                lastName + "," +
                phoneNumber + "," +
                streetName + "," +
                city + "," +
                state + "," +
                zipCode + "," +
                country;
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
    public String toRawCSVFormatString() {
        return genSpaces() + firstName + genSpaces() + "," +
                genSpaces() + lastName + genSpaces() + "," +
                genSpaces() + phoneNumber + genSpaces() + "," +
                genSpaces() + streetName + genSpaces() + "," +
                genSpaces() + city + genSpaces() + "," +
                genSpaces() + state + genSpaces() + "," +
                genSpaces() + zipCode + genSpaces() + "," +
                genSpaces() + country + genSpaces();
    }

    @Override
    public String toString() {
        return "Entry{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
