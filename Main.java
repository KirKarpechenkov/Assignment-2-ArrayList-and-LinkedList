/**
 * The Main class is the entry point of the program.
 * It demonstrates the usage of various data structures and their operations.
 */
public class Main {
    public static void main(String[] args) {

       System.out.println("MyArrayList");

       MyList<Integer> arrayList = new MyArrayList<>();

       for (int i = 0; i < 3; i++) {
           arrayList.add(i);
       }
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       arrayList.set(2, 33);
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       arrayList.add(1, 22);
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       arrayList.addFirst(0);
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       arrayList.addLast(4);
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       System.out.println(arrayList.get(2));

       System.out.println(arrayList.getFirst());

       System.out.println(arrayList.getLast());

       arrayList.remove(2);
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       arrayList.removeFirst();
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       arrayList.removeLast();
       for (Integer i : arrayList) {
           System.out.println(i);
       }

       System.out.println(arrayList.indexOf(22));

       System.out.println(arrayList.lastIndexOf(22));

       System.out.println(arrayList.exists(22));

       Object[] array = arrayList.toArray();
       for (Object i : array) {
           System.out.println(i);
       }

       arrayList.clear();

       System.out.println(arrayList.size());

       System.out.println("MyLinkedList");

       MyList<Integer> linkedList = new MyLinkedList<>();

       linkedList.add(1);
       linkedList.add(2);
       linkedList.add(3);
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       linkedList.set(2, 33);
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       linkedList.add(1, 22);
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       linkedList.addFirst(0);
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       linkedList.addLast(4);
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       System.out.println(linkedList.get(2));

       System.out.println(linkedList.getFirst());

       System.out.println(linkedList.getLast());

       linkedList.remove(2);
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       linkedList.removeFirst();
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       linkedList.removeLast();
       for (Integer i : linkedList) {
           System.out.println(i);
       }

       System.out.println(linkedList.indexOf(22));

       System.out.println("MyStack");

       MyStack<Integer> stack = new MyStack<>();

       stack.push(1);
       stack.push(2);
       stack.push(3);

       System.out.println(stack.pop());

       System.out.println(stack.peek());

       System.out.println(stack.size());

       System.out.println("MyQueue");

       MyQueue<Integer> queue = new MyQueue<>();

       queue.enqueue(1);
       queue.enqueue(2);
       queue.enqueue(3);

       System.out.println(queue.dequeue());

       for (Integer i : queue) {
           System.out.println(i);
       }

       System.out.println(queue.isEmpty());

       System.out.println(queue.size());


        System.out.println("MyMinHeap");

        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        for (int i = 10; i >= 4; i--) {
            minHeap.insert(i);
        }

        System.out.println(minHeap.getMin());

        System.out.println(minHeap.extractMin());

        System.out.println(minHeap.size());

        for (int i = 0; i < 3; i++) {
            minHeap.insert(i);
        }

        System.out.println(minHeap.size());

        System.out.println(minHeap.getMin());



    }
}
