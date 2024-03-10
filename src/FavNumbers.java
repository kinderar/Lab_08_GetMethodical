import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favoriteInt = 0;
        double favoriteDouble = 0.0;

        // Prompt user for favorite integer
        favoriteInt = SafeInput.getInt(in, "Enter your favorite integer: ");

        // Prompt user for favorite double
        favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double: ");

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}