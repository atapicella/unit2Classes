import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Andrew Apicella
 * @version 10 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Draws all objects
     */
    public void paintComponent(Graphics g)
    
    {
        Graphics2D g2 = (Graphics2D) g;
        int xLength = getWidth();
        int yHeight = getHeight()-200;
        Building b1 = new Building(0, yHeight, 5);
        Building b2 = new Building(100, yHeight, 6);
        Building b3 = new Building(200, yHeight, 2);
        Building b4 = new Building(300, yHeight, 4);
        Building b5 = new Building(400, yHeight, 5);
        Building b6 = new Building(500, yHeight, 6);
        Building b7 = new Building(600, yHeight, 1);
        Building b8 = new Building(700, yHeight, 3);
        Building b9 = new Building(800, yHeight, 4);
        Building b10 = new Building(900, yHeight, 6);
        Road r = new Road(xLength, yHeight+200);
        Sky sky = new Sky(xLength);
        sky.draw(g2);
        b1.draw(g2);
        b2.draw(g2);
        b3.draw(g2);
        b4.draw(g2);
        b5.draw(g2);
        b6.draw(g2);
        b7.draw(g2);
        b8.draw(g2);
        b9.draw(g2);
        b10.draw(g2);
        r.draw(g2);
    }

}
