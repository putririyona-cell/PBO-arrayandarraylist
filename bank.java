public class Bank {
    private Customer[] customerData;
    private int totalCustomers;

    public Bank() {
        customerData = new Customer[10];
        totalCustomers = 0;
    }

    public void registerCustomer(String name, String id) {
        if (totalCustomers < customerData.length) {
            customerData[totalCustomers] = new Customer(name, id);
            totalCustomers++;

            System.out.println("Nasabah berhasil didaftarkan.");
        } else {
            System.out.println("Kapasitas nasabah sudah penuh.");
        }
    }

    public Customer findCustomer(String id) {
        for (int i = 0; i < totalCustomers; i++) {
            if (customerData[i].getCustomerId().equals(id)) {
                return customerData[i];
            }
        }

        return null;
    }

    public void displayAllCustomers() {
        if (totalCustomers == 0) {
            System.out.println("Belum ada nasabah terdaftar.");
            return;
        }

        System.out.println("\n=== DAFTAR NASABAH ===");

        for (int i = 0; i < totalCustomers; i++) {
            System.out.println("\nNasabah ke-" + (i + 1));
            customerData[i].showCustomerInfo();
        }
    }
}
