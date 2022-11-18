import java.util.Scanner;

public class CalculateWaterBill {

    public static double calculateWaterBill(double gallonsUsage) {
        double minimumCharge = 18.84;
        double gallonsInCcf = 748;
        double includedGallons = gallonsInCcf * 2;

        if (gallonsUsage <= includedGallons){
            return minimumCharge;
        }else {
            double extraUsage = gallonsUsage - includedGallons;

            double extraAmountOwed = Math.ceil(extraUsage / gallonsInCcf) * 3.90;

            return minimumCharge + extraAmountOwed;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water " +
                "did you use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
    }
}
