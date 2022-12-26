package ss10_java_collection.Practice;

import java.util.*;

public class ProductManagement{
     ArrayList<Product> list = new ArrayList<>();
     Scanner sc = new Scanner(System.in);

     ProductManagement(){
         list.add(new Product(1,"Quat", 12000));
         list.add(new Product(2, "Tủ",30000));
         list.add(new Product(3,"Bàn",25000));
     }
     public void display(){
         for (int i = 0; i < list.size(); i++){
             System.out.println(list.get(i));
         }
     }
     public void add(){
         System.out.println("Id: ");
         int newId = Integer.parseInt(sc.nextLine());
         System.out.println("Name: ");
         String newName = sc.nextLine();
         System.out.println("Price: ");
         double newPrice = sc.nextDouble();
         Product product = new Product(newId, newName, newPrice);
         list.add(product);
         display();
         }

     public void edit(){
         System.out.println("Enter Id: ");
         int editId = Integer.parseInt(sc.nextLine());
         System.out.println("Enter name: ");
         String editName = sc.nextLine();
         System.out.println("Enter price: ");
         double editPrice = sc.nextDouble();
         Product product = new Product(editId, editName, editPrice);
         for (int i = 0; i < list.size(); i++){
             if(list.get(i).getId() == editId){
                 list.set(i, product);
                 break;
             }
         }
         display();
     }
     public void remove(){
         System.out.println("Remove: ");
         int removeId = Integer.parseInt(sc.nextLine());
         for (int i = 0; i < list.size(); i++){
             if(list.get(i).getId() == removeId){
                 list.remove(i);
             }
         }
     }
     public void find(){
         System.out.println("Enter name: ");
         String findName = sc.nextLine();
         for (int i = 0; i < list.size(); i++){
             if(findName.equals(list.get(i).getName())){
                 System.out.println(list.get(i));
             }
         }
     }
     public void sort(){
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() < o2.getPrice()){
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()){
                    return 1;
                }
                return 0;

            }
        });
     }

}



