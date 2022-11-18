package ss3_array_methods;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = new int [15];
        int n = 10;
        int atIndex = 4;
        for (int i = 0; i < n; i++){
            arr[i] = i + 1;
        }
        System.out.println("Before delete: ");
        for (int element : arr){
            System.out.println(element + " ");
        }
        System.out.println("");
        for (int i = atIndex; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println("After delete: ");
        for (int elemnet: arr){
            System.out.println(elemnet + " ");
        }
    }
}
