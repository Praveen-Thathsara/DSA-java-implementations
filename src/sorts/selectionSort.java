package sorts;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {4, 5, 3, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int least = i;

            // Step 1: find minimum element index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }

            // Step 2: swap once
            if (i != least) {
                int temp = arr[i];
                arr[i] = arr[least];
                arr[least] = temp;
            }
        }

        // Print sorted array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
