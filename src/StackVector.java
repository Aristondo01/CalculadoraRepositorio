import java.util.Vector;

public class StackVector<E> implements Stack<E>
{
    Vector<E> Box = new Vector<E>();
    /**Ingresar al vector*/
    public void push( E ingreso)
    {
        Box.add(ingreso);
    }
    /**Obtener y eliminar ultimo objeto*/
    public E pop()
    {
        E temp =Box.get(size()-1);
        Box.remove(size()-1);
        return temp;
    }
    /**Obtiene ultimo elemento*/
    public E peek()
    {
        E temp =Box.get(size()-1);
        return temp;
    }
    /**Verifica si esta vacio*/
    public boolean empty()
    {
        return  Box.size()==0;
    }
    /**Tamaño del vector*/
    public int size()
    {
        return Box.size();
    }
}
