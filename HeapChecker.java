//Created by Tahim Bhuiya


/**
 * HeapChecker
 * -----------
 * Utility class to determine whether an integer array (interpreted as a binary heap
 * stored in level-order) satisfies the min-heap or max-heap property.
 *
 * Indexing rules for a heap in an array (0-based):
 *   parent at i
 *     -> left  child at 2*i + 1
 *     -> right child at 2*i + 2
 *
 * We only need to iterate over the non-leaf parents: indices [0 .. floor((n-2)/2)].
 */
public class HeapChecker {
    /**
     * Returns true if the given array represents a min heap.
     * A min heap requires every parent to be <= each of its children (if they exist).
     **/
    public static boolean isMinHeap(int[] arr) {
        int n = arr.length; // total number of elements

        // Iterate through all internal nodes (non-leaf parents)
        // The last parent is at index floor((n - 2) / 2)
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left  = 2 * i + 1; // left child index
            int right = 2 * i + 2; // right child index

            // If left child exists and is smaller than its parent, it's not a min heap
            if (left < n && arr[i] > arr[left]) {
                return false;
            }

            // If right child exists and is smaller than its parent, it's not a min heap
            if (right < n && arr[i] > arr[right]) {
                return false;
            }
        }
        // No violations found => it's a min heap
        return true;
    }
    /**
     * Returns true if the given array represents a max heap.
     * A max heap requires every parent to be >= each of its children (if they exist).
     */
    public static boolean isMaxHeap(int[] arr) {
        int n = arr.length; // total number of elements

        // Iterate through all internal nodes (non-leaf parents)
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left  = 2 * i + 1; // left child index
            int right = 2 * i + 2; // right child index

            // If left child exists and is greater than its parent, it's not a max heap
            if (left < n && arr[i] < arr[left]) {
                return false;
            }

            // If right child exists and is greater than its parent, it's not a max heap
            if (right < n && arr[i] < arr[right]) {
                return false;
            }
        }
        // No violations found => it's a max heap
        return true;
    }
    /**
     * Driver method: defines three sample arrays and reports
     * whether each is a min heap, max heap, or neither.
     */
    public static void main(String[] args) {
        // Example arrays
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};        // should be a min heap
        int[] B = {11, 9, 7, 5, 3, 1, -1, -3, -5, -7};    // should be a max heap
        int[] C = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};        // neither

        // Evaluate and print results
        checkAndPrint("A", A);
        checkAndPrint("B", B);
        checkAndPrint("C", C);
    }
        /**
     * Helper method to print whether the provided array is a min heap, max heap, or neither.
     */
    private static void checkAndPrint(String label, int[] arr){
        if (isMinHeap(arr)) {
            System.out.println("Array " + label + " is a min heap."); //shows that it is a min heap
        } else if (isMaxHeap(arr)) {
            System.out.println("Array " + label + " is a max heap.");
        } else {
            System.out.println("Array " + label + " is neither a max heap nor a min heap.");
        }
    }
}