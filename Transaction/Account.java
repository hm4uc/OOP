import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
    }

    /**
     * Them giao dich vao danh sach cac giao dich.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * In danh sach giao dich.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            System.out.print("Giao dich " + (i + 1) + ": ");
            double money = (double) Math.round(transitionList.get(i).getAmount() * 100) / 100;
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Nap tien $");
            } else if (transitionList.get(i).getOperation().equals(Transaction.WITHDRAW)) {
                System.out.print("Rut tien $");
            }
            if ((money * 100) % 10 == 0) {
                System.out.print(money + "0");
            } else {
                System.out.print(money);
            }
            System.out.print(". So du luc nay: $");
            double curBalance = (double) Math.round(transitionList.get(i).getBalance() * 100) / 100;
            if ((curBalance * 100) % 10 == 0) {
                System.out.print(curBalance + "0");
            } else {
                System.out.print(curBalance);
            }
            System.out.println(".");
        }
    }
}
