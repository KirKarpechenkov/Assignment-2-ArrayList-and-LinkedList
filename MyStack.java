import java.util.Iterator;

public class MyStack<T> implements Iterable<T>{
    private MyArrayList<T> list = new MyArrayList<>();

    public Iterator<T> iterator() {
        return list.iterator();
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    public T peek() {
        return list.getLast();
    }


    public int size() {
        return list.size();
    }
}
