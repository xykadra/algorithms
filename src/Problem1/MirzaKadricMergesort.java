package Problem1;

public class MirzaKadricMergesort {
    private int[] a; // The original array

    private int[] temporaryArrayRight; // Temporary array for odd numbers
    private int[] temporaryArrayLeft;  // Temporary array for even numbers

    //Constructor
    public MirzaKadricMergesort(int[] a) {
        this.a = a;

        int evenSize = 0;

        // Calculate the size of the temporary arrays for even and odd numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                evenSize++;
        }

        this.temporaryArrayLeft = new int[evenSize];
        this.temporaryArrayRight = new int[a.length - evenSize];

        int evenIndex = 0;
        int oddIndex = 0;

        // Place numbers accordingly in temporary arrays with even and odd numbers
        for (int el : a) {
            if (el % 2 == 0)
                this.temporaryArrayLeft[evenIndex++] = el;
            else
                this.temporaryArrayRight[oddIndex++] = el;
        }
    }

   //Initiates the even and odd merge sort algortihm
    public void sort() {
        oddEvenMergeSort(this.temporaryArrayLeft, 0, this.temporaryArrayLeft.length);
        oddEvenMergeSort(this.temporaryArrayRight, 0, this.temporaryArrayRight.length);

        // Merge the sorted temporary arrays back into the original array
        for (int i = 0; i < this.temporaryArrayLeft.length; i++) {
            this.a[i] = this.temporaryArrayLeft[i];
        }

        for (int i = 0; i < this.temporaryArrayRight.length; i++) {
            this.a[i + this.temporaryArrayLeft.length] = this.temporaryArrayRight[i];
        }
    }

    //Recursive method to perform even and odd merge sort of array
    private void oddEvenMergeSort(int[] array, int low, int high) {
        if (high - low <= 1)
            return;
        int m = (high + low) / 2;
        oddEvenMergeSort(array, low, m);
        oddEvenMergeSort(array, m, high);
        oddEvenMerge(array, low, m, high);
    }

    //Method thaat is mergin two halves of array, even and odd
    private void oddEvenMerge(int[] array, int low, int mid, int high) {
        int i = low; // index of left part of array
        int j = mid; // index of right part of array
        int[] mergedArr = new int[high - low];
        int x = 0; // index of mergedArr

        // Merge the two halves in an odd-even manner
        while (i < mid && j < high) {
            if (array[i] < array[j]) {
                mergedArr[x++] = array[i++];
            } else {
                mergedArr[x++] = array[j++];
            }
        }

        // Copy remaining elements from left subarray
        while (i < mid) {
            mergedArr[x++] = array[i++];
        }

        // Copy remaining elements from right subarray
        while (j < high) {
            mergedArr[x++] = array[j++];
        }

        // Copy merged array back to the original array
        x = 0;
        for (int k = low; k < high; k++) {
            array[k] = mergedArr[x++];
        }
    }


    public void printArray() {
        for (int el : this.a) {
            System.out.print(el + ", ");
        }
    }
}
