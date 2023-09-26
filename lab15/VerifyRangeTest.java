import java.util.Scanner;

public class VerifyRangeTest
{
    public static void main(String[] args)
    {
        Verifier verifier = new Verifier();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        int inputNumber = scanner.nextInt();

        try
        {
            verifier.verifyIntRange(inputNumber, 1, 100);
            System.out.println("Number in range!");
        }
        catch (MyOutOfRangeException e)
        {
            System.out.println(e + ": number " + inputNumber + " is out of range!");
        }
        
        System.out.println("Please enter a password:");
        String inputPassword = scanner.next();

        try
        {
            verifier.verifyPasswordStrength(inputPassword);
            System.out.println("Good password.");
        }
        catch (MyInvalidPasswordException e)
        {
            System.out.println(e + ": Password: " + inputPassword + " is not strong enough!");
        }
        scanner.close();
    }
}