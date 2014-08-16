import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class LifeDisplayer extends Actor implements ILifeObserver
{
   int life;
   GreenfootSound sound;
    public LifeDisplayer(GreenfootSound sound){
        life=3;
        setImage(new GreenfootImage("Life:3" , 40, java.awt.Color.YELLOW, new java.awt.Color(0,0,0,0)));
        this.sound=sound;
    }
    public void act() 
    {
        display();
        if(life==0){
            setImage(new GreenfootImage("GAME OVER" , 80, java.awt.Color.YELLOW, new java.awt.Color(0,0,0,0)));
            Greenfoot.delay(4);
            //Greenfoot.setWorld(new Menu());
            StateManager stateManager = StateManager.getInstance();
            stateManager.changeWorld();

            sound.stop();
        }
        // Add your action code here.
    }  
    public void update(){
       System.out.println("update LifeDisplayer..."+this.getWorld());
       //List gm=this.getWorld().getObjects(Label.class);
       //System.out.println("gm::: "+gm);
       //Label lifeval=(Label)(gm.get(0));
       //lifeval.setText(""+(life++));
       //addObject(lifeval, 800,30);
       this.setText("Life:"+(--life));
       //try{
       //    Thread.sleep(1000);
       //}catch(Exception e){            
       //}
    }
    public void display(){
        
    }
    public void setText(String text)
    {
        setText(text, 40);
    }
    public void setText(String text, int size)
    {
        setImage(new GreenfootImage(text , size, java.awt.Color.YELLOW, new java.awt.Color(0,0,0,0)));
    }
}
