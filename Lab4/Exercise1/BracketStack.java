/**
 * BracketStack.java
 * Your Name: Ceyda Nisa Dogan
 * Your Student ID: 210446031
 * Your Date: 26.10.2026
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // Add an element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        char value = top.data;
        top = top.next;
        return value;
    }

    // Return the top element without removing it
    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return top.data;
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
