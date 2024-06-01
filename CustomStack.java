

package sortingAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class CustomStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor
    public CustomStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int item) {
        stack.push(item);
        if (minStack.isEmpty() || item <= minStack.peek()) {
            minStack.push(item);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println(" stack is empty. Nothing to pop.");
            return -1;
        }
        int poppedValue = stack.pop();
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
        return poppedValue;
    }

    // Method to get the top element of the stack
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println(" stack is empty. Nothing to peek.");
            return -1;
        }
        return stack.peek();
    }

    // Method to get the minimum element in the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("The stack is empty. No minimum value.");
            return -1;
        }
        return minStack.peek();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1: Push an element");
            System.out.println("2: Pop an element");
            System.out.println("3: Peek at the top element");
            System.out.println("4: Get the minimum element");
            System.out.println("5: Check if the stack is empty");
            System.out.println("6: Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push onto the stack: ");
                    int element = scanner.nextInt();
                    customStack.push(element);
                    System.out.println("Pushed " + element + " onto the stack.");
                    break;
                case 2:
                    int poppedValue = customStack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped: " + poppedValue);
                    }
                    break;
                case 3:
                    int topValue = customStack.peek();
                    if (topValue != -1) {
                        System.out.println("Peek: " + topValue);
                    }
                    break;
                case 4:
                    int minValue = customStack.getMin();
                    if (minValue != -1) {
                        System.out.println("Minimum element: " + minValue);
                    }
                    break;
                case 5:
                    if (customStack.isEmpty()) {
                        System.out.println(" stack is empty.");
                    } else {
                        System.out.println(" stack is not empty.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
