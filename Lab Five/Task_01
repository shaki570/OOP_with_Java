class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Sonali Bank";

    // Constructor
    BankAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    // Static Method
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // Display Account Information
    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating Objects
        BankAccount acc1 = new BankAccount(
                "112233445566",
                "Shaki",
                100000
        );

        BankAccount acc2 = new BankAccount(
                "998877665544",
                "Rahat",
                500000
        );

        // Calling Static Method
        BankAccount.showBankName();

        // Displaying Information
        acc1.displayInfo();
        acc2.displayInfo();
    }
}
