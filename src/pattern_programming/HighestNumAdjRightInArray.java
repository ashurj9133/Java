package pattern_programming;

import java.util.ArrayList;
import java.util.List;

/* Question 01 : Write a java program to find out all the highest number in a array whose adjacent right number should be smaller.
   Input 1 = {1,2,4,3,5,2}, Output = {4,5,2}
   Input 1 = { 2, 5, 3, 7, 4, 8 }, Output = {5,7,8}
*/
public class HighestNumAdjRightInArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 5, 3, 7, 4, 8 };
        int arr2[] = {1,2,4,3,5,2};
        int maxSofar = 0;
        List<Integer> result = new ArrayList<Integer>();
        straightTraverse(arr2, maxSofar, result);
        reverseTraverse(arr1, maxSofar, result);
    }

    public static void reverseTraverse(int[] arr, int maxSofar, List<Integer> result) {
        maxSofar = arr[arr.length - 1];
        result.add(maxSofar);
        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i-1] > arr[i]) {
                maxSofar = arr[i-1];
                result.add(maxSofar);
            }
        }

        List<Integer> reverseResult = new ArrayList<Integer>();
        for (int i = result.size() - 1; i >= 0; i--) {
            reverseResult.add(result.get(i));
        }
        for (int i : reverseResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void straightTraverse(int[] arr, int maxSofar, List<Integer> result) {
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i + 1] < arr[i]) {
                maxSofar = arr[i];
                result.add(maxSofar);
            }
        }
        maxSofar = arr[arr.length - 1];
        result.add(maxSofar);

        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        result.clear();
    }
}