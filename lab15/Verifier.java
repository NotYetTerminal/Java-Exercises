public class Verifier
{
    MyOutOfRangeException myOutOfRangeException = new MyOutOfRangeException();

    public Verifier()
    {

    }

    public void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException
    {
        if (value > high || value < low)
        {
            throw myOutOfRangeException;
        }
    }

    public void verifyPasswordStrength(String password) throws MyInvalidPasswordException
    {
        if (password.length() < 8)
        {
            throw new MyInvalidPasswordException();
        }
    }
}