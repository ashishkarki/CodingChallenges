package main.hackerRank.languageProficiency.java.dataStructures;

import java.util.*;
import java.util.function.Consumer;

public class JavaArrayList {

    private static void findIntegers(List<Integer[]> inputList, List<Integer[]> queryList) {
        queryList.forEach(query -> {
            Integer[] inputArray = inputList.get(query[0] - 1); // go to that line; query is 1-indexed

            if(query[1] > inputArray.length){
                System.out.println("ERROR!");
            } else {
                System.out.println(inputArray[query[1] - 1]);
            }
        });
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // n: number of inputs

        // now read the inputs as n different lines
        List<Integer[]> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt(); // d: number of integers in this line

            Integer[] inputLine = new Integer[d];
            for (int j = 0; j < inputLine.length; j++) {
                inputLine[j] = scan.nextInt();
            }

            inputList.add(inputLine);
        }

        // now read the query#
        int q = scan.nextInt();

        List<Integer[]> queryList = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            // each query line consists of two integers: x y where x is the input line number
            // and y is the integer to find in that input line
            Integer[] queryLine = new Integer[2];
            queryLine[0] = scan.nextInt();
            queryLine[1] = scan.nextInt();

            queryList.add(queryLine);
        }

        findIntegers(inputList, queryList);
    }
}
