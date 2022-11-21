package ss4_classes_object.StopWatch;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100000);
        }
        Built myWatch = new Built();
        myWatch.start();
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                }

            }
        }
        myWatch.end();
        double watch = myWatch.getElapsedTime();
        System.out.println("Time: " + watch);
    }

}
