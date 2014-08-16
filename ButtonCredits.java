import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ButtonCredits extends Button
{
    private Credits credits;
    
    public ButtonCredits()
    {
        credits = new Credits();
    }
    
   
    public void act() 
    {
        super.act();
    }    
    
   
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            //clicSound.play();
            getWorld().addObject(credits, 
                                getWorld().getWidth()/2,
                                getWorld().getHeight()/2);
            getWorld().addObject(new Back(), 
                                credits.getX() - credits.getImage().getWidth()/2,
                                credits.getY() - credits.getImage().getHeight()/2);
        }
    }    
}
