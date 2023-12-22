package Problem2;
import java.util.Arrays;

public class MirzaKadricQuicksort {

    public static void sort(char[] array) {
        quickSort(array, 0, array.length - 1);
    }
    // Method to calculate pivot index based on specified criteria
    public static int indexOfPivot(char[] array) {
        int sum = 0;
       //ASCII
        for (char el : array) {
            sum += (int) el;
        }

        int avg = sum / array.length;
        // Modulo operation
        return avg % array.length;
    }


    // Partitioning of an array and pivot placement
    public static int partition(char[] array, int low, int high) {
       //Calculating pivot index and placing it inside variable pivotIndex
        int pivotIndex = indexOfPivot(Arrays.copyOfRange(array, low, high + 1)) + low;
        char pivot = array[pivotIndex];
        exchange(array, pivotIndex, high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                exchange(array, i, j);
            }
        }

        exchange(array, i + 1, high);
        return i + 1;
    }

    // Recursive method to perform quicksort
    public static void quickSort(char[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    // Exchange method
    public static void exchange(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

