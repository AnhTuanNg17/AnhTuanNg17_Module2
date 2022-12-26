package ss12_SortAlgorithm.InsertSort;

public class InsertSort {
    public static int[] array = {5, 9, 55, 15, 67, 89, 22, 11, 19, 23};

    public static void insertSort(int[] args) {
        int arrLength = array.length;
        int temp;
        int j;
        for (int i = 0; i < arrLength; i++) {
            temp = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Before: ");
        for (int elements : array) {
            System.out.print(elements + " ");
        }

        System.out.println("\nAfter: ");
        insertSort(array);
        for (int elements : array) {
            System.out.print(elements + " ");
        }

    }
}
