package ss8_arraylist_linkedlist.LinkedList;


public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public void add(int index, E e){


    }
    public void addFirst(){

    }

    class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }

}
