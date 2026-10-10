public class Main {
    public static void main(String[] args) {
        Bank bankApp = new Bank();

        System.out.println("================================");
        System.out.println("     BANK MANAGEMENT SYSTEM");
        System.out.println("================================");

        // Mendaftarkan nasabah
        bankApp.registerCustomer("Andi Saputra", "C101");
        bankApp.registerCustomer("Siti Amelia", "C102");
        bankApp.registerCustomer("Budi Pratama", "C103");

        // Membuat rekening untuk setiap nasabah
        Customer firstCustomer = bankApp.findCustomer("C101");
        Customer secondCustomer = bankApp.findCustomer("C102");
        Customer thirdCustomer = bankApp.findCustomer("C103");

        firstCustomer.createAccount(1500000);
        secondCustomer.createAccount(2500000);
        thirdCustomer.createAccount(1000000);

        // Melakukan transaksi
        System.out.println("\n=== TRANSAKSI REKENING ===");

        Account firstAccount = firstCustomer.getAccount(0);
        firstAccount.addFunds(500000);
        firstAccount.takeFunds(200000);

        Account secondAccount = secondCustomer.getAccount(0);
        secondAccount.addFunds(300000);

        // Menampilkan saldo akhir
        System.out.println("\n=== SALDO AKHIR ===");
        System.out.println(
            firstCustomer.getCustomerName()
            + " : Rp" + firstAccount.checkBalance()
        );

        System.out.println(
            secondCustomer.getCustomerName()
            + " : Rp" + secondAccount.checkBalance()
        );

        // Menampilkan informasi seluruh nasabah
        bankApp.displayAllCustomers();

        // Contoh pencarian nasabah
        System.out.println("\n=== PENCARIAN NASABAH ===");

        Customer result = bankApp.findCustomer("C102");

        if (result != null) {
            System.out.println(
                "Nasabah ditemukan: " + result.getCustomerName()
            );
        } else {
            System.out.println("Nasabah tidak ditemukan.");
        }

        System.out.println("\nProgram selesai.");
    }
}
