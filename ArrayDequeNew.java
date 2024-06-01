package sortingAlgorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ArrayDequeNew {

    public static void main(String[] args) {
        Deque<Object> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1: Enqueue an element");
            System.out.println("2: Dequeue an element");
            System.out.println("3: Peek at the front element");
            System.out.println("4: Check if the queue is empty");
            System.out.println("5: Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter an element to enqueue: ");
                    String input = scanner.nextLine();
                    Object element = parseInput(input);
                    queue.offer(element);
                    System.out.println("Enqueued " + element + " into the queue.");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty. Nothing to dequeue.");
                    } else {
                        Object dequeuedValue = queue.poll();
                        System.out.println("Dequeued: " + dequeuedValue);
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty. Nothing to peek.");
                    } else {
                        Object frontValue = queue.peek();
                        System.out.println("Peek: " + frontValue);
                    }
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("The queue is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Object parseInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e1) {
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e2) {
                return input; // return the input string if it's neither an integer nor a double
            }
        }
    }
}
