import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        // set up scanner
        Scanner scanner = new Scanner(System.in);
        // initialize variables
        // git hub comment
        int MPG;
        double tankCapacity;
        double percentage;
        // MPG input
        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        MPG = scanner.nextInt();
        if(MPG > 0 ){
            // Tank Capacity
            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
            tankCapacity = scanner.nextDouble();
            if(tankCapacity > 0){
                // percentage of gas tank full
                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
                percentage = scanner.nextDouble();
                if(percentage >= 0 && percentage <= 100){
                    // calculate how far car can go
                    double rawRange = MPG * tankCapacity * (percentage * 0.01);
                    rawRange = Math.floor(rawRange);
                    int rawRange1 = (int) rawRange;
                    if(rawRange1 <= 25){
                        System.out.print("Attention! Your current estimated range is running low: " + rawRange1 + " miles left!!!");
                    } else {
                        System.out.print("Keep driving! Your current estimated range is: " + rawRange1 + " miles!");
                    }
                }else{
                    System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                }
            } else{
                System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            }
        } else {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        }




    }


}
