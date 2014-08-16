/**
 * Write a description of class StateManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StateManager  
{
    IStates iState;
    MenuState menuState;
    PlayState playState;
    LevelState levelState;
    private static StateManager stateManager;
    
    
    private StateManager() {
        System.out.println("Creating");
        menuState = new MenuState(this);
        playState = new PlayState(this);
        levelState = new LevelState(this);
        iState = menuState;
    }
    
    public static StateManager getInstance() {
        if(stateManager == null) {
            stateManager = new StateManager();
        }
        return stateManager;
    }
    
    public void setNext(String world) {
        if(world.equals("Menu")) {
            iState = menuState;
        } /*else if(world.equals("Level")) {
            iState = levelState;
        }*/ else if(world.equals("Play")) {
            iState = playState;
        }
    }
    
    public void changeWorld() {
        System.out.println(iState.getClass());
        iState.changeWorld();
    }
}
