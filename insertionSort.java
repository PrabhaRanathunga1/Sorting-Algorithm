package sortingAlgorithm;

import java.util.Scanner;

public class insertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.println("Array before sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Array after sorting:");
        printArray(arr);

        System.out.print("Enter a new string to insert: ");
        String newString = scanner.nextLine();

        arr = insertString(arr, newString);

        System.out.println("Array after inserting and sorting:");
        printArray(arr);

        scanner.close();
    }

    // Function to perform Insertion Sort on an array of strings
    static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Function to insert a new string into the sorted array and re-sort it
    static String[] insertString(String[] arr, String newString) {
        int n = arr.length;
        String[] newArr = new String[n + 1];
        System.arraycopy(arr, 0, newArr, 0, n);
        newArr[n] = newString;
        insertionSort(newArr);
        return newArr;
    }

    // Function to print an array of strings
    static void printArray(String[] arr) {
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
