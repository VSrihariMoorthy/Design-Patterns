public class RealDatabase implements Database {
    @Override
    public void readData() {
        System.out.println("Reading data from the database.");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing '" + data + "' to the database.");
    }
}
