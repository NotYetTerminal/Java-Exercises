public class BankCustomer
{
    private String name;
    private String address;

    // holds the three savings accounts
    private int numberOfAccounts;
    private SavingsAccount[] savingAccountsArray = new SavingsAccount[3];

    public BankCustomer(String name, String address)
    {
        numberOfAccounts = 0;
        setName(name);
        setAddress(address);
    }

    // gets individual and total balances
    public float balance()
    {
        float total = 0;
        for (int index = 0; index < numberOfAccounts; index++)
        {
            total += savingAccountsArray[index].getSavingsBalance();
            System.out.println("Account " + String.valueOf(savingAccountsArray[index].getAccountNumber() + " balance: " + String.valueOf(savingAccountsArray[index].getSavingsBalance())));
        }
        return total;
    }

    // adds in new account if possible
    public void addAccount(SavingsAccount newAccount)
    {
        if (numberOfAccounts == savingAccountsArray.length)
        {
            System.out.println("Customer full!");
            return;
        }
        savingAccountsArray[numberOfAccounts] = newAccount;
        numberOfAccounts += 1;
    }

    // getters and setters
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
}
