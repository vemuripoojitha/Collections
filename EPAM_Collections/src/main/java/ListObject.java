import java.util.Arrays;
 
public class ListObject<T> 
{
    private int size = 0;
    private int listsize = 10;
    private Object listobj[];
 
    public ListObject() {
        listobj = new Object[listsize];
    }
 
    
     
    public T remove(int index) {
        Object item = listobj[index];
        int numElts = listobj.length - ( index + 1 ) ;
        System.arraycopy( listobj, index + 1, listobj, index, numElts ) ;
        size--;
        return (T) item;
    }
     
    
    public int size() {
        return size;
    }
    private void ensureCapacity() {
        int newSize = listobj.length*4;
        listobj = Arrays.copyOf(listobj, newSize);
    }
    
    public void add(T element) {
        if (size == listobj.length) {
            ensureCapacity();
        }
        listobj[size++] = element;
    }
    
    public T get(int index) {
        return (T) listobj[index];
    }
    public void display() {
    	for(int i=0;i<listobj.length;i++)
    		System.out.println(listobj[i]+" ");
    }

}