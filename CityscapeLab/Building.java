import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class Building
{
    private int xLeft;
    private int yTop;
    public void building(int x, int y)
    {
     xLeft = x;
     yTop = y;
    }
    public static void draw(Graphics g)
    {    
        Rectangle body = new Rectangle(int xLeft, int yTop, 100, 400);
        Rectangle window1 = new Ractangle(xLeft+20, yTop+15, 50, 70);
        Rectangle window2 = new Rectangle(xLext+20, yTop+115,50,70);
        Rectangle window3 = new Rectangle(xLeft+20, yTop+215,50,70);
        Rectangle window4 = new Rectangle(xLeft+20, yTop+315,50,70);
        g2.draw(window1);
        g2.fill(window1);
        g2.draw(window2);
        g2.draw(window3);
        g2.draw(window4);
        
    }

}
