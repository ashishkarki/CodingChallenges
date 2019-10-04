package main.hackerRank.languageProficiency.java.dataStructures;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @hackerrank-source: https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */
public class JavaSubArray {

    private static int findNumberOfNegativeSubArrays(int[] arr) {
        int numOfNegativeSubArrays = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int[] slice = IntStream.rangeClosed(i, j)
                        .map(k -> arr[k])
                        .toArray();

                int sum = Arrays.stream(slice).reduce(0, (a, b) -> a + b);

                if(sum < 0) {
                    numOfNegativeSubArrays++;
                }
            }
        }

        return numOfNegativeSubArrays;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        // call some helper function
        int numOfNegativeSubArrays = findNumberOfNegativeSubArrays(a);

        // printout result
        System.out.println(numOfNegativeSubArrays);
    }
}
