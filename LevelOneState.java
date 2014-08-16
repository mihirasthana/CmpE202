import java.util.*;
import greenfoot.*;
public class LevelOneState implements IState
{
    GreenfootImage bgimage;
    ArrayList<String> charlieimages;
    private ArrayList observers;
    public LevelOneState()
    {
        charlieimages=new ArrayList<String>();
        observers=new ArrayList();
    }
    
   public ArrayList changeCharlie()
   {
        charlieimages.add("06.png");
        charlieimages.add("08.png");
        charlieimages.add("08.png");
        charlieimages.add("07.png");       
        charlieimages.add("07.png");
        return charlieimages;

   }
   public ArrayList changeHurdles(){return null;}
   public void changeScoreDisplayer(){}
    public GreenfootImage changeBG(){
    bgimage = new GreenfootImage("circus_bg1.jpg");
    return bgimage;
   }
    
}
