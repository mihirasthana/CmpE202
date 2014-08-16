import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Button
{
    
    public void act() 
    {
        // Add your action code here.
        super.act();
        //this.click();
    }
    
    /**
     * Cierra la ventana para ver nuevamente el menu.
     */
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            //clicSound.play();
            //getWorld().removeObject(actor);
            //getWorld().removeObject(this);
            LevelContext levelContext = new LevelContext();
            levelContext.changeStrategy(new EasyStrategy());
            levelContext.setSpeed();
            //Greenfoot.setWorld(new Circus());
            StateManager stateManager = StateManager.getInstance();
            stateManager.changeWorld();

        }
    }
}
