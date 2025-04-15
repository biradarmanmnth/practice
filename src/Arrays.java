public class Arrays {

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
}
