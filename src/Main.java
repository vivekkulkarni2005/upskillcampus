public class Main {

    public static void main(String[] args) {

        Account acc = new Account(
                "ACC1001",
                "Vivek",
                "1234"
        );

        acc.deposit(5000);

        acc.withdraw(1000);

        acc.displayDetails();

        System.out.println("\nTransaction History:");

        for (String t : acc.getTransactions()) {
            System.out.println(t);
        }
    }
}