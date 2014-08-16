import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends KinectWorld
{
    private static final int THUMBNAIL_WIDTH = 80;
    private static final int THUMBNAIL_HEIGHT = 60;

    //private GreenfootSound soundFondo;
    private ButtonPlay buttonplay;
   
    public Menu()
    {     
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false); 
        
        //soundFondo = new GreenfootSound("shootToThrill.mp3");
        //buttonplay = new ButtonPlay();
        ButtonPlay buttonPlay = new ButtonPlay();
        prepare();
    }
    
    public void act()
    {
        //soundFondo.playLoop();
        //if(Greenfoot.mouseClicked(botonplay) && soundFondo.isPlaying())
        //    soundFondo.stop();
    }
    
    
    public void prepare()
    {
        addObject(new ButtonPlay(), -200, 260);
        addObject(new ButtonCredits(), -600, 360);
        addObject(new ButtonLevels(), -800, 460);
        //addObject(new ButtonRecords(), -800, 400);
    }
}
