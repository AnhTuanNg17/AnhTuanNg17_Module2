package ss10_java_collection.Poster;

public class Test {
    public static void main(String[] args) {
        Poster poster = new Poster();
        poster.root = new Node(10);
        poster.root.left = new Node(20);
        poster.root.right = new Node(30);
        poster.root.left.left = new Node(40);
        poster.root.right.right = new Node(50);

        poster.postOrder();
    }
}
