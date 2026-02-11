public class Account {
    private static int lastId = 0;

    public final int id = ++lastId;

    public String firstName;
    public String lastName;
    public double balance;

    public Account() {
        firstName = "Unknown";
        lastName = "Unknown";
        balance = 0.0;
    }


    public Account(String firstName, String lastName) {
        this();

        this.firstName = firstName;
        this.lastName = lastName;

    /*
    setFirstName(firstName);
    setLastName(lastName);
    */
    }

    public static int getLastId() {
        return lastId;
    }
}

