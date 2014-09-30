import java.util.Scanner;

public class Rectangle
{


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double s1, s2;
        System.out.println("Enter length for side 1:");
        s1 = scan.nextDouble();
        System.out.println("Enter length for side 2:");
        s2 = scan.nextDouble();
        
        
        double perim = s1+s1+s2+s2;
        double area = s1*s2;
        
        double diag = Math.sqrt((s1*s1)+(s2*s2));
        System.out.println("\nPerimeter: " + perim + "\nArea: " + area + "\nDiagonal: " + diag);
    }

}
