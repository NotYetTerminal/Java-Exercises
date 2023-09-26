// 2
public class Lab3q2Driver
{
    public static void main(String[] args)
    {
        // initialising
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setSavingsBalance(2000);
        SavingsAccount saver2 = new SavingsAccount();
        saver2.setSavingsBalance(3000);

        // changing interest rate
        SavingsAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1: " + String.valueOf(saver1.getSavingsBalance()));
        System.out.println("Saver 2: " + String.valueOf(saver2.getSavingsBalance()));

        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1: " + String.valueOf(saver1.getSavingsBalance()));
        System.out.println("Saver 2: " + String.valueOf(saver2.getSavingsBalance()));

    }
}
