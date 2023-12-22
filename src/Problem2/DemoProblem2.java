import Problem1.MirzaKadricMergesort;
import Problem2.MirzaKadricQuicksort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DemoProblem2 {
    public static void main(String[] args) {
        char[] characters = {'m', 'i', 'r', 'z', 'a', '2', '1', '.', '3','/','2','0','1','2'};

        MirzaKadricQuicksort sorter = new MirzaKadricQuicksort();

        sorter.sort(characters);
        System.out.println("*******Problem 2*******");
        System.out.println("Sorted characters: " + Arrays.toString(characters));
    }
}