
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

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {11, 9, 7, 5, 3, 1, -1, -3, -5, -7};
        int[] C = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};

        checkAndPrint("A", A);
        checkAndPrint("B", B);
        checkAndPrint("C", C);
    }