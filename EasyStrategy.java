import greenfoot.*;

/**
 * Write a description of class EasyStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyStrategy implements IStrategy 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class EasyStrategy
     */
    public EasyStrategy()
    {
    }

     public void setSpeed() {
        Greenfoot.setSpeed(35);
    }
}
