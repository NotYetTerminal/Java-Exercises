// 2
public class SavingsAccount
{
    // keeps track of number of accounts
    private static int numberOfAccounts = 0;
    private int accountNumber;

    private static int annualInterestRate = 0;
    private float savingsBalance;

    public SavingsAccount()
    {
        // increment and set numbers
        setNumberOfAccounts(numberOfAccounts + 1);
        setAccountNumber(numberOfAccounts);
    }

    public void calculateMonthlyInterest()
    {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    // getters and setters
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public static void setNumberOfAccounts(int numberOfAccounts)
    {
        SavingsAccount.numberOfAccounts = numberOfAccounts;
    }

    public static int getNumberOfAccounts()
    {
        return numberOfAccounts;
    }

    public static void modifyInterestRate(int annualInterestRate)
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static int getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setSavingsBalance(float savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    public float getSavingsBalance()
    {
        return savingsBalance;
    }
}
