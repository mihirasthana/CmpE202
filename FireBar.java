import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class FireBar extends Actor implements IHurdle
{
     ArrayList<String> charlieimages;
     IRepository iRepository;
    IIterator iIterator;
    GreenfootImage charlieimg;
    public FireBar() {
        charlieimages=new ArrayList<String>();
        //charlieimages.add("hook.png");
        charlieimages.add("firebar1.png");
        charlieimages.add("firebar2.png");
        iRepository=new ImageRepository(charlieimages);
        iIterator=iRepository.createIterator();
    }
    
   public void animate()
   {
       move(-8);
    }
   public void act()
   {
       animate();
       
       runFireBar();
       
        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }
    
     public void runFireBar(){
        String imagename=iIterator.next();
        charlieimg = new GreenfootImage(imagename);
        setImage(charlieimg);
    }
}
