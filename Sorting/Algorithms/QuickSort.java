import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{11, 2, 3, 5, 6, 10, 9, 8, 7};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {

            int partition = findPartition(arr, begin, end);

            quickSort(arr, begin, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    public static int findPartition(int[] arr, int begin, int end) {

        int pivot = arr[end];

        int i = begin - 1;

        for(int j = begin; j < end; j++) {

            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);

        return ++i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
