/**
 * Global utils being used in the project.
 */
public class Utils {

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
