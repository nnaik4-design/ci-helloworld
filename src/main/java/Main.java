public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Min: " + ArrayUtils.findMin(arr));
        System.out.println("Max: " + ArrayUtils.findMax(arr));
        System.out.println("Sum: " + ArrayUtils.sum(arr));
        System.out.println("Average: " + ArrayUtils.average(arr));
        System.out.println("Contains 5: " + ArrayUtils.contains(arr, 5));
        System.out.println("Index of 5: " + ArrayUtils.indexOf(arr, 5));
        System.out.println("Count of 5: " + ArrayUtils.countOf(arr, 5));
    }
}
