package Encapsulation;
//Create a class called BankAccount with the following:
//
//        🔒 Private Fields:
//        accountNumber (String)
//
//        accountHolderName (String)
//
//        balance (double)
//
//        ✅ Requirements:
//        Create a constructor to initialize all fields.
//
//        Write getters and setters for each field.
//
//        If balance is set to a negative value, print: "Invalid balance amount" and don't set it.
//
//        Override toString() to print details like:
//        "Account No: 123456 | Holder: John | Balance: 2500.0"
//
//        In main(), create an array of 3 BankAccount objects and display their details using a for-each loop.

     //   Let me know once you're done and I’ll review it with you! Or if you get stuck, I’m right here 😄
public class BankAccount {

            String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0){
            System.out.println("Invalid Number");
        }
        else {
            this.balance = balance;
        }
    }

    @Override
    public String toString(){
        return "Bank Details of person "+accountHolderName+" is: "+accountNumber+", balance: "+balance;
    }

    public static void main(String[] args) {
        BankAccount bank[] = new BankAccount[3];
        bank[0] = new BankAccount("Ab123","Shashi", 125000);
        bank[1] = new BankAccount("Ab124","Bhushan", 135000);
        bank[2] = new BankAccount("Ab125","Pathipaka", -123.5);

        for (BankAccount b: bank) {
            System.out.println(b);
        }

    }
}
