/**
 * The MyMinHeap class represents a minimum heap data structure.
 * It stores elements of type T, where T must implement the Comparable interface.
 */
public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();

    /**
     * Returns the number of elements in the heap.
     */
    public int size() {
        return list.size();
    }

    /**
     * Checks if the heap is empty.
     *
     * @return true if the heap is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * Returns the minimum element in the heap.
     */
    public T getMin() {
        return list.get(0);
    }

    /**
     * Removes and returns the minimum element in the heap.
     */
    public T extractMin() {
        T min = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        heapify(0);
        return min;
    }

    /**
     * Inserts an element into the heap.
     *
     * @param item the element to be inserted
     */
    public void insert(T item) {
        list.add(item);
        int i = list.size() - 1;
        while (i > 0 && list.get(i).compareTo(list.get((i - 1) / 2)) < 0) {
            T temp = list.get(i);
            list.set(i, list.get((i - 1) / 2));
            list.set((i - 1) / 2, temp);
            i = (i - 1) / 2;
        }
    }

    /**
     * Rearranges the elements in the heap rooted at the given index to maintain the heap property.
     * This method assumes that the subtrees rooted at the left and right child of the given index are already heaps.
     *
     * @param i the index of the element to heapify
     */
    private void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left < list.size() && list.get(left).compareTo(list.get(smallest)) < 0) {
            smallest = left;
        }
        if (right < list.size() && list.get(right).compareTo(list.get(smallest)) < 0) {
            smallest = right;
        }
        if (smallest != i) {
            T temp = list.get(i);
            list.set(i, list.get(smallest));
            list.set(smallest, temp);
            heapify(smallest);
        }
    }
}