import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuState implements IStates
{
    StateManager stateManager;
    
    MenuState(StateManager stateManager) {
        this.stateManager = stateManager;
    }        
    
    public void changeWorld() {
        Greenfoot.setWorld(new Circus());
        stateManager.setNext("Play");
    }
    
}
