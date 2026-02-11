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


    /**
     * Allow setting of the account owner's last name.
     * @param lastName the account owner's last name.
     * @throws IllegalArgumentException Invalid last name! Last name can't be null or empty for id: 1
     */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.lastName = lastName;
    }
}

