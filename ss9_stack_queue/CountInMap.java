package ss9_stack_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountInMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra các từ lặp lại:");
        String string = sc.nextLine();
        String[] arrST = string.split("");
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < arrST.length; i++) {

            if (result.containsKey(arrST[i])){
                result.put(arrST[i], result.get(arrST[i]) + 1);
            }
            else {
                result.put(arrST[i], 1);
            }

            }
        for (Map.Entry<String, Integer> e: result.entrySet()){
            System.out.println(e.getKey() + e.getValue());

        }


    }
}
