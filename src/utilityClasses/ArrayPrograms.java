package utilityClasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPrograms {

    public static void secondHighestElement() {
        //Find the second highest element in the given array using one for loop
        int[] numbers = {5, 8, 2, 6, 9, 3, 7, 0, 2, 8};
        int highest = 0;
        int sHighest = 0;

        if (numbers.length == 2) {
            if (numbers[0] > numbers[1]) {
                highest = numbers[0];
                sHighest = numbers[1];
            } else {
                highest = numbers[1];
                sHighest = numbers[0];
            }
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (highest < numbers[i]) {
                    sHighest = highest;
                    highest = numbers[i];
                }
            }
        }
        System.out.println("Second highest element is: " + sHighest);
        System.out.println("highest element is: " + highest);
    }

    public static void firstMissingPositiveNumber() {
        //Find the first missing positive number from the given array
        int[] numbers = {0, 1, 3, 4, 5, 6, 7, 8, 9};


    }
    //Write a program to find the max consecutive of 0’s count from a given array
    //Array : {1,0,1,0,1,0,1,0,0,0,0,0,1,0,1}
    public static void maxConsecutiveZeroCount() {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1};
        int maxCount = 0, currentCount = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 0) {
                currentCount++;
                if (maxCount < currentCount)
                    maxCount = currentCount;
            } else currentCount = 0;
        }
        System.out.println("Approch :1 Max count :" + maxCount);

        //==== approach : 2 ============================================================

        for(int num:arr){
            currentCount=num==0?currentCount+1:0;
            maxCount=Math.max(maxCount,currentCount);
        }
        System.out.println("Approch :2 Max count :" + maxCount);


    }

    // Remove duplicates and sort the array
    public static void removeDuplicatesAndSort(int [] a) {
       List<Integer> sortedDistinctArray= Arrays.stream(a).boxed().distinct().sorted(Comparator.reverseOrder()).toList();
    }
}
