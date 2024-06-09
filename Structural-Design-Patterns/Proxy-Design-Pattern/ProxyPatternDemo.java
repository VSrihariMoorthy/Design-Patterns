public class ProxyPatternDemo {
    public static void main(String[] args) {
        Database userDatabase = new DatabaseProxy("User");
        Database adminDatabase = new DatabaseProxy("Admin");

        System.out.println("User trying to read data:");
        userDatabase.readData();
        System.out.println("User trying to write data:");
        userDatabase.writeData("User data");

        System.out.println("\nAdmin trying to read data:");
        adminDatabase.readData();
        System.out.println("Admin trying to write data:");
        adminDatabase.writeData("Admin data");
    }
}
