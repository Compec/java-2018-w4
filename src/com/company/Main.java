package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Bubble sort algorithm implementation
    // Sort that keeps swapping pairs of elements until
    // it is not able to swap any incorrect pair.
    // In that case the array is sorted
    public static int[] bubbleSort(int[] unsortedArray) {
        boolean haveSwapped = true;
        while(haveSwapped) {
            haveSwapped = false;
            for(int i = 0; i < (unsortedArray.length - 1); i++) {
                if(unsortedArray[i] > unsortedArray[i + 1]) {
                    // hey I swapped
                    // which means the array is still unordered
                    haveSwapped = true;
                    // we have to swap them!
                    int tmp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = tmp;
                    // now the array elements are swapped
                }
            }
        }
        return unsortedArray;
    }

    // Checks if a given word is palindrome (can be read from both sides) or not
    public static boolean isPalindrome(String str) {
        // Loop only halfway through otherwise we would be doing
        // twice the work (optimization)
        for(int i = 0; i < str.length() / 2; i++) {
            char firstSide = str.charAt(i);
            char secondSide = str.charAt(str.length() - i - 1 );
            if(firstSide != secondSide) {
                System.out.println("Character at index " + i + " does not match");
                return false; // early return
                // As soon as we find a pair that does not match,
                // we know that the word cannot be palindrom
            }
        }
        return true; // otherwise it is palindrome
    }

    // Checks if a given word is palindrome or not
    public static void checkPalindrome() {
        Scanner console = new Scanner(System.in);
        String word;
        System.out.println("Give me a word: ");
        word = console.nextLine();
        System.out.println("Palindrome? " + isPalindrome(word));
    }

    public static void ticTacToeGrid() {
        char[][] grid = new char[3][3];
        for(int i = 0; i < 3; i++) { // Outer loops traverses the array row-wise
            for(int j = 0; j < 3; j++) { // Inner loop traverse the inner array element-wise
                grid[i][j] = 'X';
            }
        }
        grid[1][1] = 'O'; // Can access element directly like this
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    // Shows how to resize arrays in Java
    public static void expandArrayExample() {
        int[] oldArray = new int[2];
        oldArray[0] = 0;
        oldArray[1] = 1;
        // Cannot extend directly, need to create a copy of it
        // which has bigger size

        int[] newArray = new int[3]; // Has one more element to it

        System.out.println("old array contains");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.println(oldArray[i]);
        }
        // Copying existing elements into newArray
        for(int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        // "Added" element
        newArray[2] = 2;

        // Displaying new array
        System.out.println("new array contains");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }

    public static void listUsageExample() {
        // List are a Java collection that is kind of an array
        // but more powerful.
        // We can add and remove elements from it
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println("before");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // Access is using .get() method, not []
        }
        list.remove(1); // Removing element at index 1

        // Display
        System.out.println("after");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void sortExample() {
        Scanner console = new Scanner(System.in);
        System.out.println("How many items to sort? ");
        int arraySize = console.nextInt();
        console.nextLine();

        int[] values = new int[arraySize]; // Arrays can have a runtime specified size like `arraySize`
        // Runtime is the opposite of Compile-time
        // Compile time means something determined during compilation aka specifiying something directly in code
        // Run time means something determined during actual execution of program
        for (int i = 0; i < values.length; i++) {
            System.out.println("item " + i + ": ");
            values[i] = console.nextInt();
            console.nextLine();
        }

        values = bubbleSort(values); // Bubble sort is a example of a sorting algorithm

        System.out.println("Your values are sorted!");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static void swapExample() {
        int a = 1;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Swapping requires temporary variable otherwise one of the values is lost
        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("Swapped!");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void averageExample() {
        double[] score = new double[4];
        score[0] = 85;
        score[1] = 73;
        score[2] = 52;
        score[3] = 65;

        System.out.println("Scores: ");
        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        double sum = 0;
        for(int i = 0; i <= 3; i++) {
            sum += score[i];
        }
        double average = sum / 4;

        System.out.println("The average of all scores is: " + average);

    }

    public static void main(String[] args) {
        // Uncomment the lines you would like to run
//        averageExample();
//        listUsageExample();
//        swapExample();
//        sortExample();
//        expandArrayExample();
    }
}
