import java.util.*;

class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum1 = 0; // Even sum
        int sum2 = 0; // Odd sum

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 = sum1 + arr[i];
            } else {
                sum2 = sum2 + arr[i];
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}


