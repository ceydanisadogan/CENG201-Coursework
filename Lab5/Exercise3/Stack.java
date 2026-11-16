public class Stack {
    private char[] array;
    private int top;

    public Stack(int capacity) {
        array = new char[capacity];
        top = -1;
    }

    public void push(char c) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        }
        array[++top] = c;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return array[top--];
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }
}
