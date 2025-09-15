import java.util.*;
import java.util.Arrays;

public class MergeSort {

    // Merge function
    public static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Merge both halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements of left half
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy remaining elements of right half
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy temp back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Recursive merge sort
    static void ms(int[] arr, int low, int high) {
        if (low >= high) 
        return;

        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    // Public function to call
    public static void mergeSort(int[] arr, int n) {
        ms(arr, 0, n - 1);
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4};
        int n = arr.length;

        mergeSort(arr, n);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
