import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 5, 6, 10, 9, 8, 7};

        mergeSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int numberOfElements) {

        if(numberOfElements < 2) {
            return;
        }

        int mid = numberOfElements / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[numberOfElements - mid];

        for(int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for(int i = mid; i < numberOfElements; i++) {
            rightArr[i - mid] = arr[i];
        }

        mergeSort(leftArr, mid);
        mergeSort(rightArr, numberOfElements - mid);

        merge(arr, leftArr, rightArr, mid, numberOfElements - mid);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left && j < right) {
            if(leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while(i < left) {
            arr[k++] = leftArr[i++];
        }

        while(j < right) {
            arr[k++] = rightArr[j++];
        }
    }

}
