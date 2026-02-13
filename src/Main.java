public class Main {
    public static void main(String[] args) {
       try {
           Account a1 = new Account("First", "Last");
           System.out.println(a1.id);
           System.out.println(a1.firstName);
           System.out.println(a1.lastName);

           System.out.println();

           Account a2 = new Account("Debbie", "Johnson");
           System.out.println(a2.id);
           System.out.println(a2.firstName);
           System.out.println(a2.lastName);

           a2.deposit(50);
           System.out.println(a2.getBalance());

           a2.withdrawal(40);
           System.out.println(a2.getBalance());



       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}