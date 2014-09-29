import java.util.Scanner;
public class Annuity
{
   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double pmt, i, n;
        System.out.println("Enter a periodic payment");
        pmt = scan.nextDouble();
        System.out.println("Enter an interest rate");
        i = scan.nextDouble();
        System.out.println("Enter number of payments");
        n = scan.nextDouble();
        
        /*
        double pmt =   (int) scan.nextInt();
        scan = new Scanner(System.in);
        double i =   (int) scan.nextInt();
        scan = new Scanner(System.in);
        double n =   (int) scan.nextInt();
        */
        
        double dnom = Math.pow(1+i, n-1);
        double mid = i;
        double nom = Math.pow(1+i, n-1)-1;
        double combined = (nom/mid/dnom) + 1;
        double pvann = (pmt*combined);
        System.out.println(pvann);
    }

}
