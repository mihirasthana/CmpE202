import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Charlie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Charlie extends Actor implements ICharlie
{
    private GreenfootImage charlieimg;    
    ArrayList<String> charlieimages;
    IRepository iRepository;
    IIterator iIterator;
    private ArrayList observers;
    private ArrayList lifeobservers;
    long pauseTime = 0;   
    boolean leftHandFlagUp=false;
    boolean finishFlag = false;
    
    /**
     * Act - do whatever the Charlie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Charlie(ArrayList charlieimages){
        this.charlieimages= charlieimages;
        /*charlieimages=new ArrayList<String>();
        //charlieimages.add("06.png");
            charlieimages.add("06.png");
            charlieimages.add("08.png");
            charlieimages.add("08.png");
            charlieimages.add("07.png");       
            charlieimages.add("07.png");*/
            
            iRepository=new ImageRepository(charlieimages);
            iIterator=iRepository.createIterator();
            observers=new ArrayList();
        lifeobservers=new ArrayList();
    }
    public void act() 
    {
        this.runCharlie();
        
        
        
        Circus world = (Circus)getWorld();

        UserData[] users = world.getTrackedUsers();
        //System.out.println("user location:  "+users[0]);
        for (UserData user : users)
        {
            //Joint rightHand = user.getJoint(Joint.RIGHT_HAND);
            //getImage().fillOval(rightHand.getX(), rightHand.getY(), 20, 20);
           
            //List gm=this.getWorld().getObjects(Charlie.class);
            Charlie charlie=this;
            
            if (user.getJoint(Joint.LEFT_HAND).getY() < user.getJoint(Joint.HEAD).getY())
            {
                charlie.setImage(new GreenfootImage(world.charlieJumpImage));
                charlie.setLocation(getX(), world.charlieLongJump);
                //this.bringLeftDown();
                //pause(1000);
                //if(running()) {
                    //this.bringDown(310);
                //}
            }
            else if (user.getJoint(Joint.RIGHT_HAND).getY() < user.getJoint(Joint.HEAD).getY())
            {
                charlie.setImage(new GreenfootImage(world.charlieJumpImage));
                charlie.setLocation(getX(), world.charlieSmallJump);                
            }
            else if (user.getJoint(Joint.RIGHT_HAND).getX() > user.getJoint(Joint.RIGHT_ELBOW).getX())
            {
                
                charlie.setLocation((getX())+4, world.charlielevel);                
            }
            else if (user.getJoint(Joint.LEFT_HAND).getX() < user.getJoint(Joint.LEFT_ELBOW).getX())
            {
               
                charlie.setLocation((getX()) -4, world.charlielevel);                
            }
            else {
                charlie.setLocation(getX(), world.charlielevel);
                
            }
            
        }
        
        Circus circus=(Circus)this.getWorld();
        if((circus.x % 800==0) && circus.x!=0){
            notifyObserver();
        }
        
        Actor firePot=this.getOneIntersectingObject((Firepot.class));
        if(firePot!=null)
        {
            this.setImage(new GreenfootImage("09.png"));
            System.out.println("Firepot intersects:");
            notifyLifeObserver();
            Greenfoot.delay(20);
            this.getWorld().removeObject(firePot);                      
        }
        
        Actor fireBar=this.getOneIntersectingObject((FireBar.class));
        if(fireBar!=null)
        {
            this.setImage(new GreenfootImage("09.png"));
            System.out.println("FireBar intersects:");
            notifyLifeObserver();
            Greenfoot.delay(20);
            this.getWorld().removeObject(fireBar);           
        }
        
        Actor finishPost=this.getOneIntersectingObject((FinishPost.class));
        if(finishPost!=null && !finishFlag) {
            finishFlag = true;
            System.out.println("finish post: ");  
            this.setLocation(900, this.getWorld().getHeight() - 165);
            charlieimages=new ArrayList<String>();
            //charlieimages.add("06.png");
            if(circus.levelFlag==1){
                charlieimages.add("010.png");
                charlieimages.add("011.png");
                charlieimages.add("012.png");
                charlieimages.add("013.png");       
                charlieimages.add("014.png");
                charlieimages.add("015.png");
            }
            else if(circus.levelFlag==2){
                charlieimages.add("14.png");
                charlieimages.add("15.png");
                charlieimages.add("16.png");
                charlieimages.add("17.png");       
                charlieimages.add("18.png");
                charlieimages.add("19.png");
            }
            iRepository=new ImageRepository(charlieimages);
            iIterator=iRepository.createIterator();
            runCharlie();
        }
        
        Actor redMonkey=this.getOneIntersectingObject((RedMonkey.class));
        if(redMonkey!=null)
        {
            this.setImage(new GreenfootImage("111.png"));
            System.out.println("RedMonkey intersects:");
            notifyLifeObserver();
            Greenfoot.delay(20);
            this.getWorld().removeObject(redMonkey);                      
        }
        
        Actor blueMonkey=this.getOneIntersectingObject((BlueMonkey.class));
        if(blueMonkey!=null)
        {
            this.setImage(new GreenfootImage("111.png"));
            System.out.println("BlueMonkey intersects:");
            notifyLifeObserver();
            Greenfoot.delay(20);
            this.getWorld().removeObject(blueMonkey);                      
        }
        
        if(finishFlag) {
            //this.setLocation(900, this.getWorld().getHeight() - 165);
            this.setLocation(900, circus.charlielevel - 60);
        }
    }   
    public void runCharlie(){
        String imagename=iIterator.next();
        charlieimg = new GreenfootImage(imagename);
        setImage(charlieimg);
    }
    
    public void attachObserver(IObserver O){
        observers.add(O);
        System.out.println("attached observer:: "+observers.toString());
    }
    
    public void dettachObserver(IObserver O){
        observers.remove(O);
    }
    
    public void attachLifeObserver(ILifeObserver ILO){
        lifeobservers.add(ILO);
        System.out.println("attached observer:: "+lifeobservers.toString());
    }
    
    public void dettachLifeObserver(ILifeObserver ILO){
        
    }
    
    public void notifyObserver(){
        for(int i=0;i<observers.size();i++){
            IObserver observer=(IObserver)observers.get(i);
            System.out.println("notifying observer now...");
            observer.update();            
        }
    }
    
    public void notifyLifeObserver(){
        for(int i=0;i<observers.size();i++){
            ILifeObserver lifeobserver=(ILifeObserver)lifeobservers.get(i);
            System.out.println("notifying life observer now...");
            lifeobserver.update();
        }
    }
    
    public void bringDown(int ylocation){
        leftHandFlagUp=true;
        if(400>ylocation){
           //System.out.println("ylocation: "+ylocation); 
            //pause(1000);
           // if(running()){
                
            //}
            //else{
                this.setLocation(150, ylocation++);
                System.out.println("ylocation: "+this.getY()); 
                bringDown(ylocation);
            //}            
        }
        else{
            leftHandFlagUp=false;
        }
    }
    
    public void bringLeftDown(){
        this.setLocation(150, 330);
       pause(1000);
       if(!running()) {
               
       }
        
    }
        
    public boolean running()  
    {  
        long time = System.currentTimeMillis();  
        System.out.println("time: "+time);
        return time > pauseTime;  
    }  
    public void pause(long delay)  
    {  
        long time = System.currentTimeMillis(); 
       pauseTime = time+delay;  
         System.out.println("pauseTime: "+pauseTime);
    }  
    
    
}
