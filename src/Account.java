public class Account {
    /**
     * Class variable for maintaining the last account number used.
     */
    private static int lastId = 0;

    /**
     * the unique account number assigned by the default constructor.
     */
    public final int id;

    /**
     * The account owner's first name.
     */
    public String firstName;

    /**
     * The account owner's last name.
     */
    public String lastName;

    /**
     * the current account balance.
     */
    public double balance;

    /**
     * The default constructor sets a unique account id based on the last account id and also sets all the initial values for instance level fields.
     */
    public Account() {
        id = lastId++;
        firstName = "Unknown";
        lastName = "Unknown";
        balance = 0.0;
    }

    /**
     * The overload constructor calls the default constructor and then allows overriding the default values for the account owner's name by calling the setters for data validation.
     * @param firstName - the account owner's first name.
     * @param lastName -  the account owner's last name.
     */
    public Account(String firstName, String lastName) {
        this();

        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     *
     * @return
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * allow retrieval of the current account balance
     * @return the current account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * allow setting the account owner's first name but only if it's not blank
     * @param firstName account owner's first name
     * @throws IllegalArgumentException - invalid first name! First name can't be null or empty for id: 1
     */
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

    /**
     * allows making a deposit for amounts greater than zero.
     * @param amount the amount to add to the account balance
     * @throws IllegalArgumentException - invalid amount [-100.00] must be greater than 0
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount " + amount + ". Must be greater than 0.");
        }
        balance += amount;
    }

    /**
     * allows making a withdrawal for amount greater than zero and NOT greater than the account balance
     * @param amount the amount to reduce the account balance
     * @throws IllegalArgumentException - invalid amount [-100.00] must be greater than 0
     * @throws IllegalArgumentException - invalid amount [500.00] cannot be greater than the account balance [100.00].
     */
    public void withdrawal(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount " + amount + ". Must be greater than 0.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Invalid Amount " + amount + ". Cannot be greater than the account balance.");
        }
        balance -= amount;
    }

    /**
     * general account information (id and name) as a string. Example: ID #1: Debbie Johnson
     * @overrides toString in class Object
     * @return the account's id and name
     */
    @Override
    public String toString() {
        return  ("ID #" + id + ": " + firstName + " " + lastName);
    }
}

