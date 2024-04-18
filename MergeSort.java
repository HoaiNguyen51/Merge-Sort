public class MergeSort {

    public static void MergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            MergeSort(left);
            MergeSort(right);

            merge(arr, left, right);
        }
    }

    public static void merge(int[] arr, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {

        int[] thisArray = {21, 59, 64, 99, 72, 31, 43, 76, 10};

        System.out.print("Original Array: ");
        for (int num : thisArray) {
            System.out.print(num + ", ");
        }

        MergeSort(thisArray);

        System.out.print("\nSorted Array: ");
        for (int num : thisArray) {
            System.out.print(num + ", ");
        }
    }
}