import greenfoot.*;

/**
 * Write a description of class MediumStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumStrategy  implements IStrategy
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MediumStrategy
     */
    public MediumStrategy()
    {
    }

    public void setSpeed() {
        Greenfoot.setSpeed(40);
    }
}
