public class Stack {
    private char[] array;
    private int top;

    public Stack(int capacity) {
        array = new char[capacity];
        top = -1;
    }

    public void push(char c) {
        array[++top] = c;
    }

    public char pop() {
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}