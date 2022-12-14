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

        // Tách các từ trong chuỗi vừa nhập
        String[] arrST = string.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s: arrST){
            if(map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s,value);
            } else {
                map.put(s,1);
            }
        }
        System.out.println(map.toString());


    }
}
