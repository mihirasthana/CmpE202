import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class RedMonkey extends Actor implements IHurdle
{
     ArrayList<String> redMonkeyImages;
     IRepository iRepository;
    IIterator iIterator;
    GreenfootImage redMonkeyimg;
    public RedMonkey() {
        redMonkeyImages=new ArrayList<String>();
        //charlieimages.add("hook.png");
        redMonkeyImages.add("monkey0.png");
        redMonkeyImages.add("monkey01.png");
        redMonkeyImages.add("monkey02.png");
        iRepository=new ImageRepository(redMonkeyImages);
        iIterator=iRepository.createIterator();
    }
    
   public void animate()
   {
       move(-8);
    }
   public void act()
   {
       animate();
       
       runRedMonkey();
       
        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }
    
     public void runRedMonkey(){
        String imagename=iIterator.next();
        redMonkeyimg = new GreenfootImage(imagename);
        setImage(redMonkeyimg);
    }
}
