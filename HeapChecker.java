
public class HeapChecker {

    public static boolean isMinHeap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            if (2 * i + 1 < n && arr[i] > arr[2 * i + 1]) return false;
            if (2 * i + 2 < n && arr[i] > arr[2 * i + 2]) return false;
        }
        return true;
    }

    public static boolean isMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            if (2 * i + 1 < n && arr[i] < arr[2 * i + 1]) return false;
            if (2 * i + 2 < n && arr[i] < arr[2 * i + 2]) return false;
        }
        return true;
    }