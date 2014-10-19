import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *creates a road
 * 
 * @author (Andrew Apicella) 
 * @version (10 October 2014)
 */
public class Road
{
    private int x;
    private int y;
    /**
     * Constructor for objects of class Road
     * 
     * @param xLength width of frame
     * 
     * @param yHeight height of frame
     * 
     */
    public Road(int xLength, int yHeight)
    {
        x = xLength;
        y = yHeight;
    }

    /**
     * Draws the road
     * 
     * @param  g2   graphics contex
     */
    public void draw(Graphics2D g2)
    {
      /**creates road*/
      Rectangle main = new Rectangle(0/*X*/, y-100/*Y*/, 1015/*Width*/, 200/*Height*/ );
      /**creates 10 yellow lines in road*/
      Rectangle l1 = new Rectangle(24, y-65 ,75, 25);
      Rectangle l2 = new Rectangle(123, y-65 ,75, 25);
      Rectangle l3 = new Rectangle(222, y-65 ,75, 25);
      Rectangle l4 = new Rectangle(321, y-65 ,75, 25);
      Rectangle l5 = new Rectangle(420, y-65 ,75, 25);
      Rectangle l6 = new Rectangle(519, y-65 ,75, 25);
      Rectangle l7 = new Rectangle(618, y-65 ,75, 25);
      Rectangle l8 = new Rectangle(717, y-65 ,75, 25);
      Rectangle l9 = new Rectangle(816, y-65 ,75, 25);
      Rectangle l10 = new Rectangle(915, y-65 ,75, 25);
      g2.setColor(Color.black);
      g2.fill(main);
      g2.setColor(Color.yellow);
      g2.fill(l1);
      g2.fill(l2);
      g2.fill(l3);
      g2.fill(l4);
      g2.fill(l5);
      g2.fill(l6);
      g2.fill(l7);
      g2.fill(l8);
      g2.fill(l9);
      g2.fill(l10);      

    }
}
