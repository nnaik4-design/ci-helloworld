public class ArrayUtils {

    /**
     * Finds the minimum value in the array.
     * @param arr the input array
     * @return the minimum value
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Finds the maximum value in the array.
     * @param arr the input array
     * @return the maximum value
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Calculates the sum of all elements in the array.
     * @param arr the input array
     * @return the sum
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        return total;
    }

    /**
     * Calculates the average of all elements in the array.
     * @param arr the input array
     * @return the average as a double
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        return (double) sum(arr) / arr.length;
    }

    /**
     * Checks if the array contains the target value.
     * @param arr the input array
     * @param target the value to search for
     * @return true if found, false otherwise
     * @throws IllegalArgumentException if the array is null
     */
    public static boolean contains(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int a : arr) {
            if (a == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds the index of the first occurrence of the target value.
     * @param arr the input array
     * @param target the value to search for
     * @return the index, or -1 if not found
     * @throws IllegalArgumentException if the array is null
     */
    public static int indexOf(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Counts the number of occurrences of the target value in the array.
     * @param x the input array
     * @param target the value to count
     * @return the count of occurrences
     */
    public static int countOf(int[] x, int target) {
        int count = 0;
        for (int a : x) {
            count = a == target ? count + 1 : count;
        }
        return count;
    }
}
