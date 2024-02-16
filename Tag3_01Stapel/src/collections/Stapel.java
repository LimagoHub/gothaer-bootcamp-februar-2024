package collections;

public class Stapel<T> {

    private T []data;
    private int index;

    public Stapel() {
        this(10);
    }

    public Stapel(int size) {
        data = (T[]) new Object[size];
        index = 0;
    }

    public void push(T value) throws StapelException{
        if(isFull()) throw new StapelException("Overflow");
        data[index++] =value;
    }

    public T pop() throws StapelException {
        if(isEmpty()) throw new StapelException("Underflow");
        return data[--index];
    }

    public boolean isEmpty() {
        return index <= 0;
    }

    public boolean isFull() {
        return index >= data.length;
    }

}
