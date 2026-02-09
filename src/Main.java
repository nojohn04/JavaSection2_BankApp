public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("Nolan", "Johnson");

        System.out.println(a1.id);
        System.out.println(a1.firstName);
        System.out.println(a1.lastName);

        System.out.println();

        System.out.println(a2.id);
        System.out.println(a2.firstName);
        System.out.println(a2.lastName);


    }
}