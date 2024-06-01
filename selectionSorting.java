package sortingAlgorithm;

import java.util.Scanner;

public class selectionSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print(" number of persons: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Input array of persons
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" name of person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print(" age of person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            persons[i] = new Person(name, age);
        }

        // Perform selection sort
        selectionSort(persons);

        // Display sorted array
        System.out.println("Sorted persons by age:");
        for (Person person : persons) {
            System.out.println(person);
        }

        scanner.close();
    }

    // Selection sort algorithm for Person objects
    public static void selectionSort(Person[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].age < arr[minIndex].age) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Swap arr[i] and arr[minIndex]
                Person temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
