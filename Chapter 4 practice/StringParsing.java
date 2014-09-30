import java.util.Scanner;
public class StringParsing
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     String input;
     System.out.println("Enter an integer between 1,000 and 999,999: ");
     input = scan.next();
     int len = input.length();
     String sub1 = input.substring(0, len-4);
     String sub2 = input.substring(len-3, len);
     System.out.println(sub1 + sub2);
    }
    
    
}
