package baitapthem.view;

import baitapthem.model.Manufacturer;
import baitapthem.model.Truck;
import baitapthem.service.CarService;
import baitapthem.service.ManufactureService;
import baitapthem.service.TruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static CarService carService = new CarService();
    public static void main(String[] args) {
        while (true){
            System.out.println("----Main Menu----");
            System.out.println("1.Add\n2.Display\n3.Delete\n4.Search\n5.Exit");
            int choice = getChoice();

            switch (choice){
                case 1:{
                    add();
                }
                case 2:{
                    display();
                }
                case 3:{
                    delete();
                }
                case 4:{
                    search();
                }
                case 5:{
                    System.exit(0);
                }
                default:{
                    return;
                }
            }


        }
    }
    private static void add(){
        System.out.println("1.Truck\n2.Car\n3.Motor");
        int choice = getChoice();
        System.out.println("DrivePlate: ");
        String plate = scanner.nextLine();

        System.out.println("----List Manufacture----");
        ManufactureService manufactureService = new ManufactureService();
        List<Manufacturer> manufacturerList = new ArrayList<>();
        for (int i = 0; i <manufacturerList.size(); i++){
            System.out.println(manufacturerList.get(i));
        }
        System.out.println("Enter Manufucture Name: ");
        String manufactureName = scanner.nextLine();
        Manufacturer manufacturer = ManufactureService.findByName(manufactureName);

        System.out.println();











    }
    private static void display(){
        System.out.println("1.Truck\n2.Car\n3.Motor");
        int choice = getChoice();
        switch (choice){
            case 1:{
//                List<Truck> trucks = ();
//                for (int i = 0; i < trucks.size(); i++){
//                    System.out.println(trucks.get(i));
//                }
//            }
//            case 2:{

            }
        }

    }
    private static void delete(){

    }
    private static void search(){

    }
    private static int getChoice(){
        System.out.println("Enter your choice:");
        return Integer.parseInt(scanner.nextLine());


    }
}
