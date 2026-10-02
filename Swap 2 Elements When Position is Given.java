import java.util.*;

class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos1 = 1;
        int pos2 = 3;

        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

        System.out.println(Arrays.toString(arr));
    }
}


