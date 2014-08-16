import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonPlay extends Button
{
    
    public void act() 
    {
        super.act();
    }    
    
   
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            //clicSound.play();
           // Greenfoot.setWorld(new Circus());
           StateManager stateManager = StateManager.getInstance();
           stateManager.changeWorld();

        }
    }  
}
