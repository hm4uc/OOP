public class Test {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(1000, "deposit");
        acc.addTransaction(500, "withdraw");
        acc.printTransaction();
    }
}