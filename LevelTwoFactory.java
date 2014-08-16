
public class LevelTwoFactory  
{  
    public IHurdle createHurdle(int option)
    {
            if(option == 0)
            {
                return new RedMonkey();
            }
            else
            {
                return new BlueMonkey();
            }
    }
}
