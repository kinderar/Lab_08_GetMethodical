import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        //Prompt user to enter their first name
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        //Prompt user to enter their last name
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
