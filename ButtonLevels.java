import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonLevels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonLevels extends Button
{
    //private Levels levels;
    
    public ButtonLevels()
    {
        //levels = new Levels();
    }
    
    
    public void act() 
    {
        super.act();
    }    
    
   
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            //clicSound.play();
            //getWorld().addObject(levels, 
            //                    getWorld().getWidth()/2,
            //                    getWorld().getHeight()/2);
            //getWorld().addObject(new Back(levels), 
            //                    levels.getX() - levels.getImage().getWidth()/2,
            //                    levels.getY() - levels.getImage().getHeight()/2);
            Greenfoot.setWorld(new LevelWorld());
        }
    }    
}
