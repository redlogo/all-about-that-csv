import DataGenerator.AddressBook.Generator;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println(generator.genOneEntry().toSimpleCSVFormatString());
        DataGenerator.HarryPotter.Generator generator1 = new DataGenerator.HarryPotter.Generator();
        System.out.println(generator1.genOneEntry().toSimpleCSVFormatString());
    }
}
