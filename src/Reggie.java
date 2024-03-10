import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Get Social Security Number (SSN)
        String ssn = SafeInput.getRegExString(in, "Enter your Social Security Number (XXX-XX-XXXX): ", "^\\d{3}-\\d{2}-\\d{4}$");

        // Get UC Student M number
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (MXXXXX): ", "^(M|m)\\d{5}$");

        // Get menu choice
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O = Open, S = Save, V = View, Q = Quit): ", "^[OoSsVvQq]$");

        System.out.println("SSN: " + ssn);
        System.out.println("UC Student M number: " + mNumber);
        System.out.println("Menu choice: " + menuChoice);
    }
}
