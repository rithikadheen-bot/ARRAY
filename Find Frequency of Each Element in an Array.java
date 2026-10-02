import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 3};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println("Freq of " + arr[i] + " = " + count);
            }
        }
    }
}



