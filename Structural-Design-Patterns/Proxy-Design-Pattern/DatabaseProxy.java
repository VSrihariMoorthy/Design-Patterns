public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private String userRole;

    public DatabaseProxy(String userRole) {
        this.realDatabase = new RealDatabase();
        this.userRole = userRole;
    }

    @Override
    public void readData() {
        realDatabase.readData();
    }

    @Override
    public void writeData(String data) {
        if ("Admin".equalsIgnoreCase(userRole)) {
            realDatabase.writeData(data);
        } else {
            System.out.println("Write operation is not allowed for user role: " + userRole);
        }
    }
}