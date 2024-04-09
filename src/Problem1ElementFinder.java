import java.util.Scanner;

public class Problem1ElementFinder {
    
    /**
     * Finds the minimum element in an array.
     * 
     * @param array The array of integers
     * @return The minimum element in the array
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static int findProblem1(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int min = array[0]; // Initialize min to the first element
        
        // Loop through the array to find the minimum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        int minimum = findProblem1(array);
        System.out.println("Minimum element in the array: " + minimum);
        
        scanner.close();
    }
}
