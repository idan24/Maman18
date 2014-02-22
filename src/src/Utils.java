/**
 * Global utils being used in the project.
 */
public class Utils {

    /**
     * Exchanges the values of the two given indexes in the given array.
     */
    public static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints to the console the given array up to the given index.
     */
    public static void printArr(int[] inputArray, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(inputArray[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
