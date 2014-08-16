import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Button
{
   private Actor actor;
    /**
     * Constructor de la clase Back.
     */
    public Back()
    {
        //actor = a;
    }
    
  
    public void act() 
    {
        this.click();
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
}
