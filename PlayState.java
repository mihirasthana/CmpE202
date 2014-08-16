import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayState implements IStates 
{
    StateManager stateManager;
        
    PlayState(StateManager stateManager) {
        this.stateManager = stateManager;
    }
    
    public void changeWorld() {
        Greenfoot.setWorld(new Menu());
        stateManager.setNext("Menu");
    }
}
