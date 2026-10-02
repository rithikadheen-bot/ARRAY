import java.util.*;

class Demo {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}


