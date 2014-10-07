import java.util.Scanner;
public class DistanceConverter
{
    static final double FEET_PER_METER = 3.28084;
    static final double INCHES_PER_FEET = 12.0;
    static final double FEET_PER_MILE = 5280.0;
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double meters;
      System.out.println("Enter a measurement in meters: ");
      meters = scan.nextDouble();
      double feet = meters*FEET_PER_METER;
      double miles = feet/FEET_PER_MILE;
      double inches = feet*INCHES_PER_FEET;
      System.out.println("\nFeet: " + feet + "\nMiles: " + miles + "\nInches: " + inches);
   }
}