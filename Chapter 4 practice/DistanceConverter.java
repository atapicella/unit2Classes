public class DistanceConverter
{
    static final double FEET_PER_YARD = 3.0;
    static final double INCHES_PER_FEET = 12.0;
   public static void main(String[] args)
   {
      double yards = 3.5;
      double feet = yards * FEET_PER_YARD;
      double inches = feet * INCHES_PER_FEET;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}