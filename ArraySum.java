public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3};   // fixed array
        int sum = 0;

        // loop to add all elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];   // sum = sum + arr[i]
        }

        System.out.println("Sum of array = " + sum);
    }
}
