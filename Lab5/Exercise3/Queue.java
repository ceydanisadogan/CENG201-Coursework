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
        array[rear] = c;
        rear = (rear + 1) % array.length;
        size++;
    }

    public char dequeue() {
        char c = array[front];
        front = (front + 1) % array.length;
        size--;
        return c;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}