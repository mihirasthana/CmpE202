import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelWorld extends KinectWorld
{
     private static final int THUMBNAIL_WIDTH = 80;
    private static final int THUMBNAIL_HEIGHT = 60;

    /**
     * Constructor for objects of class LevelWorld.
     * 
     */
    public LevelWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);
        
        prepare();
    }
    
    public void act() {
        click();
    }
    
 
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            //clicSound.play();
            //getWorld().removeObject(actor);
            //getWorld().removeObject(this);
            Greenfoot.setWorld(new Menu());
        }
    }
    
    public void prepare() {
        addObject(new Easy(), -200, 260);
        addObject(new Medium(), -400, 360);
        addObject(new Hard(), -600, 460);
        addObject(new Back(), 50, 50);
    }
}
