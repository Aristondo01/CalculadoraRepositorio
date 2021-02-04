public abstract interface Stack<E>
{
    public void push(E ingreso);
    public E pop();
    public E peek();
    public boolean empty();
    public int size();

}
