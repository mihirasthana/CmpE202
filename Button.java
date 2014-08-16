import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int positionX;
    //private GreenfootSound sound;
    //protected GreenfootSound clicSound;
    //private boolean playSonido;
    public Button()
    {
        positionX=0;
        //sound = new GreenfootSound("soundB.wav");
        //clicSound = new GreenfootSound("buttonSound.wav");
        //playSonido = false;
    }
    
    public void act() 
    {
        animate();
        click();
    }   
   
    
    public void animate()
    {
        if(getX() < getWorld().getWidth()/2)
            move(positionX);
        else
        {
            setLocation(getWorld().getWidth()/2, getY());
            //if(!playSonido)
            //{
            //    sound.play();
            //    playSonido = true;
            //}
        }
        if(positionX < 10)
            positionX++;
    }
    
    
    public  void click(){}  
}
