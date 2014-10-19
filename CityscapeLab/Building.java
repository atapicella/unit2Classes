import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;




/**
 * creates a building with window 
 * 
 * @author (Andrew Apicella)
 * @version (10 October 2014)
 */
public class Building
{
    /**number of levels the building has*/
    private int levels;
    private int xLeft;
    private int yTop;

    /**
     * Constructor for objects of class Building
     * 
     * @param x x-Coordinate
     * 
     * @param y y-Coordinate
     * 
     * @param levels The number of thevels the building will have
     */
    public Building(int x, int y, int lvls)
    {
        xLeft = x;
        yTop = y;
        levels = lvls;
        
    }

    /**
     * Draws the building
     * 
     * @param  g2   graphics contex
     */
    public void draw(Graphics2D g2)
    {
      /**creates one building level*/
      Rectangle body = new Rectangle(xLeft/*X*/, yTop/*Y*/, 100/*Width*/, 100/*Height*/);
      /**creates window inside of building level*/
      Rectangle window = new Rectangle(xLeft+25, yTop+25, 50, 50);
      g2.setColor(Color.DARK_GRAY);
      g2.fill(body);
      g2.setColor(Color.ORANGE);
      g2.fill(window); 
      
      /**Creates (levels) number of levels*/
      for(int i = 1; i<=levels; i++)
      {
         /**Adds 100 to y value of body*/
         body.setLocation(xLeft, yTop-(100*i));
         g2.setColor(Color.DARK_GRAY);
         g2.fill(body);
         window.setLocation(xLeft+25, yTop-(100*i)+25);
         g2.setColor(Color.ORANGE);
         g2.fill(window);   
        }
    }
}