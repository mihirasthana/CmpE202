import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Button
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //setLocation(getWorld().getWidth()/2, getY());
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
            levelContext.changeStrategy(new HardStrategy());
            levelContext.setSpeed();
            //Greenfoot.setWorld(new Circus());
            StateManager stateManager = StateManager.getInstance();
            stateManager.changeWorld();
        }
    }
}
