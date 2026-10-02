public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 1, 4};

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x : arr) {
            sum += x;
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }

        int average = sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
