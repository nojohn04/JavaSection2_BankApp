public class Account {
    private static int lastId = 0;

    public final int id;

    public String firstName;
    public String lastName;
    public double balance;

    public Account() {
        id = lastId++;
        firstName = "Unknown";
        lastName = "Unknown";
        balance = 0.0;
    }


    public Account(String firstName, String lastName) {
        this();

        setFirstName(firstName);
        setLastName(lastName);

    }

    public static int getLastId() {
        return lastId;
    }


    public double getBalance() {
        return balance;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty())
            throw new IllegalArgumentException("Invalid first name! Name can't be blank for id: " + id);
        else
            this.firstName = firstName;
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

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount " + amount + ". Must be greater than 0.");
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid Amount " + amount + ". Must be greater than 0.");

        if (amount > balance)
            throw new IllegalArgumentException("Invalid Amount " + amount + ". Cannot be greater than the account balance.");
    }


}

