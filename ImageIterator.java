import java.util.*;
public class ImageIterator implements IIterator
{
    private ArrayList<String> images;
    int index;
    public ImageIterator(ArrayList<String> images){
        this.images=images;
        index=0;
    }
    
    public boolean hasNext(){
        if(index<images.size()){
            return true;
        }
        return false;
    }
    
    public String next(){
        if(hasNext()){
            return images.get(index++);
        }
        else
            index=0;
        return images.get(index);
    }
    
    public int getIndex(){
        return index;
    }
    
}
