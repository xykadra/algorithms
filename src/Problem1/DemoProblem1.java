import Problem1.MirzaKadricMergesort;
import Problem2.MirzaKadricQuicksort;

import java.util.Arrays;


public class DemoProblem1 {
    public static void main(String[] args) {
        int[] array = {2,5,1,8,9,12,17,4};
        MirzaKadricMergesort merger = new MirzaKadricMergesort(array);

        System.out.println("*******Problem 1*******");
        merger.sort();
        System.out.print("Even and Odd Merged: ");

        merger.printArray();
        System.out.println();

    }
}