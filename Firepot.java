import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Firepot extends Actor implements IHurdle
{
     ArrayList<String> charlieimages;
     IRepository iRepository;
    IIterator iIterator;
    GreenfootImage charlieimg;
    public Firepot() {
        charlieimages=new ArrayList<String>();
        //charlieimages.add("06.png");
        charlieimages.add("firepot1.png");
        charlieimages.add("firepot2.png");
        iRepository=new ImageRepository(charlieimages);
        iIterator=iRepository.createIterator();
        
    }
    
    public void animate()
    {
        move(-6);
    }
    public void act() 
    {
        animate();
        runFirepot();
        
        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void runFirepot(){
        String imagename=iIterator.next();
        charlieimg = new GreenfootImage(imagename);
        setImage(charlieimg);
    }
}