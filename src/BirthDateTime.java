import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Input year, month, and day of birth
        int year = SafeInput.getRangedInt(in, "Enter the year you were born (1950-2015): ", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month you were born (1-12): ", 1, 12);
        int day = getDayOfMonth(in, month);

        // Input hours and minutes of birth
        int hours = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24): ", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minute of your birth (1-59): ", 1, 59);

        // Display the entered birth date and time
        System.out.println("Your birth date and time: " + month + "/" + day + "/" + year + " " + hours + ":" + minutes);
    }

    public static int getDayOfMonth(Scanner in, int month)
    {
        switch (month)
        {
            case 2: // February
                return SafeInput.getRangedInt(in, "Enter the day of your birth (1-29): ", 1, 29);
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return SafeInput.getRangedInt(in, "Enter the day of your birth (1-30): ", 1, 30);
            default: // January, March, May, July, August, October, December
                return SafeInput.getRangedInt(in, "Enter the day of your birth (1-31): ", 1, 31);
        }
    }
}