import java.util.Iterator;

public class MyQueue<T> implements Iterable<T>{
    private MyLinkedList<T> list = new MyLinkedList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T peek() {
        return list.getFirst();
    }

    public T dequeue() {
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
