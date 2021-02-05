import java.util.Vector;

public class StackVector<E> implements Stack<E>
{
    Vector<E> Box = new Vector<E>();
    public void push( E ingreso)
    {
        Box.add(ingreso);
    }
    public E pop()
    {
        E temp =Box.get(size()-1);
        Box.remove(size()-1);
        return temp;
    }
    public E peek()
    {
        E temp =Box.get(size()-1);
        return temp;
    }
    public boolean empty()
    {
        return  Box.size()==0;
    }
    public int size()
    {
        return Box.size();
    }
}
