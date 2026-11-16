public class Queue {
    private char[] array;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        array = new char[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(char c) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }
        array[rear] = c;
        rear = (rear + 1) % array.length;
        size++;
    }

    public char dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        char c = array[front];
        front = (front + 1) % array.length;
        size--;
        return c;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public int size() {
        return size;
    }
}
