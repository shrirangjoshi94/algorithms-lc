public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 5, 6, 10, 9, 8, 7};

        boolean hasSwapped = true;

        while (hasSwapped) {
            hasSwapped = false;

            for(int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    hasSwapped = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
