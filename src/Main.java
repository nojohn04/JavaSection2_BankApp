public class Main {
    public static void main(String[] args) {
       try {
           Account a1 = new Account();
           System.out.println(a1.id);
           System.out.println(a1.firstName);
           System.out.println(a1.lastName);

           System.out.println();

           Account a2 = new Account("", "Johnson");
           System.out.println(a2.id);
           System.out.println(a2.firstName);
           System.out.println(a2.lastName);

       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}