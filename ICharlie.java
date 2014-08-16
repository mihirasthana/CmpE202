public interface ICharlie  
{
   public void attachObserver(IObserver O);
   public void dettachObserver(IObserver O);
   public void notifyObserver();
}
