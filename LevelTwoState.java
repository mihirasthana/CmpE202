import java.util.*;
import greenfoot.*;
public class LevelTwoState implements IState
{
    GreenfootImage bgimage;
    ArrayList<String> charlieimages;
    private ArrayList observers;
    public LevelTwoState()
    {
        charlieimages=new ArrayList<String>();
        observers=new ArrayList();
    }
    
   public ArrayList changeCharlie()
   {
        charlieimages.add("10.png");
        charlieimages.add("11.png");
        charlieimages.add("12.png");
        charlieimages.add("13.png");       
   
        return charlieimages;

   }
   public ArrayList changeHurdles(){return null;}
   public void changeScoreDisplayer(){}
    public GreenfootImage changeBG(){
    bgimage = new GreenfootImage("circus_bg1_2.jpg");
    return bgimage;
   }
}
