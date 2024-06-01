package sortingAlgorithm;

public class GenericStack<T> {

    private T[] stack;
    private int top;
    private int maxSize;

    // Constructor
    @SuppressWarnings("unchecked")
    public GenericStack(int maxSize) {
        this.maxSize = maxSize;
        stack = (T[]) new Object[maxSize];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(T item) {
        if (isFull()) {
            System.out.println("Stack  full. Cannot push element.");
            return;
        }
        stack[++top] = item;
    }

    // Method to pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack  empty. Cannot pop element.");
            return null; // Return null to indicate underflow
        }
        return stack[top--];
    }

    // Method to peek at the top element of the stack
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack  empty. Cannot peek element.");
            return null; // Return null to indicate underflow
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>(5);

        // Adding elements to the stack
        stack.push("apple");
        stack.push("peach");
        stack.push("avacado");
        stack.push("date");
        stack.push("watermelon");

        // Printing elements from the stack
        System.out.println("Elements in the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


