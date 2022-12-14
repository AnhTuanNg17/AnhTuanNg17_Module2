package CaseStudy.controller;

import CaseStudy.service.implement.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private Scanner sc = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public void displayMainMenu() {
        while (true) {
            System.out.println("-----Main menu-----\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("-----EmployManagent-----\n" +
                            "1.Display list employees\n" +
                            "2.Add new employee\n" +
                            "3.Edit employee\n" +
                            "4.Return main menu");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    break;
                }
                case 2: {
                    System.out.println("-----CustomerManagement-----\n"+
                            "1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    break;
                }
                case 3:{
                    System.out.println("-----Facility Management-----\n" +
                            "1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Create new constracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu");
                    int choice3 = Integer.parseInt(sc.nextLine());
                    break;
                }
                case 4: {
                    System.out.println("-----Booking Management-----\n" +
                            "1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Create new constracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu");
                    int choice4 = Integer.parseInt(sc.nextLine());
                }
                case 5:{
                    System.out.println("-----Promotion Management -----\n" +
                            "1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu");
                    int choice5 = Integer.parseInt(sc.nextLine());
                    break;
                }

                }
            }
        }
    }

