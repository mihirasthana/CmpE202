import java.util.*;
public class ImageRepository implements IRepository
{
    
    private ArrayList<String> images=new ArrayList<String>();
    public ImageRepository(ArrayList<String> images)
    {
        this.images=images;
    }
    
    public IIterator createIterator(){
        return new ImageIterator(images);
    }

}
