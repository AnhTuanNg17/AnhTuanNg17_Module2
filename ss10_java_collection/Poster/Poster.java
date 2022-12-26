package ss10_java_collection.Poster;

public class Poster {
    public Node root;

    public Poster(){
        this.root = null;
    }
    public void postOrder(Node buttoon){
        if(buttoon != null){
            postOrder(buttoon.left);
            postOrder(buttoon.right);
            System.out.println(buttoon.key + " ");
        }
    }
    public void postOrder(){
        postOrder(root);
    }


}
