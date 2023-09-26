// 3
public class Lab3q3Driver
{
    public static void main(String[] args)
    {
        // initialising
        BankCustomer bankCustomer = new BankCustomer("Bob", "23 Carlow");
        
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setSavingsBalance(2000);
        bankCustomer.addAccount(saver1);
        System.out.println("Total balance: " + String.valueOf(bankCustomer.balance()));

        SavingsAccount saver2 = new SavingsAccount();
        saver2.setSavingsBalance(5000);
        bankCustomer.addAccount(saver2);
        System.out.println("Total balance: " + String.valueOf(bankCustomer.balance()));

        SavingsAccount saver3 = new SavingsAccount();
        saver3.setSavingsBalance(7000);
        bankCustomer.addAccount(saver3);
        System.out.println("Total balance: " + String.valueOf(bankCustomer.balance()));

        SavingsAccount saver4 = new SavingsAccount();
        saver4.setSavingsBalance(9000);
        bankCustomer.addAccount(saver4);
        System.out.println("Total balance: " + String.valueOf(bankCustomer.balance()));
    }
}
