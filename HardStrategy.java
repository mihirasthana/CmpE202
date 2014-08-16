import greenfoot.*;

/**
 * Write a description of class HardStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardStrategy  implements IStrategy
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HardStrategy
     */
    public HardStrategy()
    {
    }

   public void setSpeed() {
        Greenfoot.setSpeed(45);
    }
}
