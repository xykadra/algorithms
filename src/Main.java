import Problem1.MirzaKadricMergesort;
import Problem2.MirzaKadricQuicksort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {2,5,1,8,9,12,17,4};
        MirzaKadricMergesort merger = new MirzaKadricMergesort(array);

        System.out.println("*******Problem 1*******");
        merger.sort();
        System.out.print("Even and Odd Merged: ");

        merger.printArray();
        System.out.println();

        MirzaKadricQuicksort sorter = new MirzaKadricQuicksort();

        char[] characters = {'m', 'i', 'r', 'z', 'a', '2', '1', '.', '3','/','2','0','1','2'};

        sorter.sort(characters);
        System.out.println("*******Problem 2*******");

        System.out.println("Sorted characters: " + Arrays.toString(characters));
    }
}