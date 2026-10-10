public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil.");
        } else {
            System.out.println("Nominal deposit tidak valid.");
        }
    }

    public void takeFunds(double amount) {
        if (amount <= 0) {
            System.out.println("Nominal penarikan tidak valid.");
        } else if (amount > balance) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil.");
        }
    }
}
