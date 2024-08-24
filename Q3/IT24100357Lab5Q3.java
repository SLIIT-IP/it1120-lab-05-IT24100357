import java.util.Scanner;

public class IT24100357Lab5Q3 {
    public static void main(String[] args) {
       
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int DISCOUNT_10_DAYS = 3;
        final int DISCOUNT_20_DAYS = 5;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        
        int daysReserved = endDate - startDate;

        
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

        
        if (daysReserved >= DISCOUNT_20_DAYS) {
            totalAmount -= totalAmount * DISCOUNT_20;
        } else if (daysReserved >= DISCOUNT_10_DAYS) {
            totalAmount -= totalAmount * DISCOUNT_10;
        }

      
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}