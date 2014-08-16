import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class BlueMonkey extends Actor implements IHurdle
{
     ArrayList<String> blueMonkeyImages;
     IRepository iRepository;
    IIterator iIterator;
    GreenfootImage blueMonkeyimg;
    public BlueMonkey() {
        blueMonkeyImages=new ArrayList<String>();
        //charlieimages.add("hook.png");
        blueMonkeyImages.add("monkey03.png");
        blueMonkeyImages.add("monkey04.png");
        blueMonkeyImages.add("monkey05.png");
        iRepository=new ImageRepository(blueMonkeyImages);
        iIterator=iRepository.createIterator();
    }
    
   public void animate()
   {
       move(-25);
    }
   public void act()
   {
       animate();
       
       runBlueMonkey();
       if(this.getOneIntersectingObject(RedMonkey.class)!=null){
           this.setLocation(this.getX()-10, this.getY()-30);
           this.setImage(new GreenfootImage("monkey06.png"));
        }
        if(getX()==0)
        {
            getWorld().removeObject(this);
        }
    }
    
     public void runBlueMonkey(){
        String imagename=iIterator.next();
        blueMonkeyimg = new GreenfootImage(imagename);
        setImage(blueMonkeyimg);
    }
}
