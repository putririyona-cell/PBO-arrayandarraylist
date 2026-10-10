import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String customerId;
    private ArrayList<Account> accountList;

    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.accountList = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void createAccount(double initialBalance) {
        Account newAccount = new Account(initialBalance);
        accountList.add(newAccount);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accountList.size()) {
            return accountList.get(index);
        }

        return null;
    }

    public void showCustomerInfo() {
        System.out.println("ID Nasabah : " + customerId);
        System.out.println("Nama       : " + customerName);
        System.out.println("Jumlah Rekening : " + accountList.size());

        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(
                "Saldo rekening " + (i + 1) + " : Rp"
                + accountList.get(i).checkBalance()
            );
        }
    }
}
