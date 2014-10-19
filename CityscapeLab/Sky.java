import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * creates a sky with sun
 * 
 * @author (Andrew Apicella) 
 * @version (10 October 2014)
 */
public class Sky
{
    private  int x;
    /**
     * Constructor for objects of class Sky
     */
    public Sky(int xLength)
    {
        x = xLength;
    }

    /**
     * draws the sky
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
     {
        
        int xPos = x-175;
        Ellipse2D.Double sun = new Ellipse2D.Double(xPos,25,100, 100);
        g2.setColor(new Color(255,251,0));
        g2.fill(sun);
    } 
}
