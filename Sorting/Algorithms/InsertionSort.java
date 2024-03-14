public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 5, 6, 10, 9, 8, 7};

        for(int i = 1; i < arr.length; i++) {
            int currentIndex = i;

            while(currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
                int temp =arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex--;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
