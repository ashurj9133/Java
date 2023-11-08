package pattern_programming;

import java.util.Arrays;

public class HighestSumProduct {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2, 5};

        long highestSumProduct = findHighestSumProduct(arr);
        
        System.out.println("Highest Sum of Product of Two Numbers: " + highestSumProduct);
    }

    public static long findHighestSumProduct(int[] arr) {
        if (arr.length < 2) {
            // There must be at least two numbers in the array to find a sum product.
            return 0;
        }

        // Sort the array in ascending order.
        Arrays.sort(arr);

        // The two largest numbers are at the end of the sorted array.
        int n = arr.length;
        long highestSumProduct = (long) arr[n - 1] * arr[n - 2];

        return highestSumProduct;
    }
}

