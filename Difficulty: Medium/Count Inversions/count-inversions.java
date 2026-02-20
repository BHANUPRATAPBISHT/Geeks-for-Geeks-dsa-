class Solution {

    static int count;   // to store inversion count

    // Function to count inversions
    static int inversionCount(int arr[]) {
        count = 0;          // initialize count
        mergeSort(arr);     // call merge sort
        return count;       // return total inversions
    }

    // Merge Sort function
    private static void mergeSort(int[] arr) {

        int n = arr.length;

        // Base case: if array has 1 element, it is already sorted
        if (n == 1) {
            return;
        }

        // Step 1: Create 2 new empty arrays of size n/2 each
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: Copy elements of arr into a and b
        int idx = 0;  // index to travel original array

        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        // Step 3: Recursively sort both arrays
        mergeSort(a);
        mergeSort(b);

        // Step 4: Merge a and b back into arr
        merge(a, b, arr);
    }

    // Merge function
    public static void merge(int[] a, int[] b, int[] c) {

        int i = 0, j = 0, k = 0;

        // Compare elements of a and b
        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } 
            else {
                // Inversion found
                count += (a.length - i);
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements
        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}