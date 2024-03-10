import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;

        // Prompt user for item prices until they indicate no more items
        boolean moreItems = true;
        while (moreItems) {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item ($0.50 - $10.00): ", 0.50, 10.00);
            totalCost += price;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items? (Y/N): ");
        }

        // Display total cost of the items
        System.out.printf("Total cost of the items: $%.2f\n", totalCost);
    }
}
