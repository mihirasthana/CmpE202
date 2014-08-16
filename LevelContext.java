/**
 * Write a description of class LevelContext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelContext  
{

    private IStrategy strategy;
    
    /**
     * Constructor for objects of class LevelContext
     */
    public LevelContext()
    {
        strategy = new EasyStrategy();
    }

    public void changeStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void setSpeed() {
        strategy.setSpeed();
    }
}