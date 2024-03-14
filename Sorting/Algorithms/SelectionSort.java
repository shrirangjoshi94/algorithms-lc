public class SelectionSort {

    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 5, 6, 10, 9, 8, 7};
        int minIndex;

        for(int i = 0; i < arr.length; i++) {

            minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp =arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


