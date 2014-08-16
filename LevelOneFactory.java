public class LevelOneFactory  
{   
    public IHurdle createHurdle(int option)
    {
      
            if(option == 0)
            {
                return new Firepot();
            }
            else
            {
                return new FireBar();
            } 
    }
}
