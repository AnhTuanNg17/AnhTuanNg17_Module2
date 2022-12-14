package ss8_arraylist_linkedlist.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        System.out.println("List: ");
        listInterger.output();

        listInterger.add(3, 7);
        System.out.println("After add index: ");
        listInterger.output();

        listInterger.remove(5, 0);
        System.out.println("After remove: ");
        listInterger.output();

        listInterger.indexOf(2);
        System.out.println("After indexOf: ");
        listInterger.output();

        listInterger.clear();
        System.out.println("After clear: ");
        listInterger.output();



    }
}
