import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelState implements IStates  
{
    StateManager stateManager;
    
    LevelState(StateManager stateManager) {
        this.stateManager = stateManager;
    }        
    
    public void changeWorld() {
        Greenfoot.setWorld(new Circus());
        stateManager.setNext("Play");
    }
}
