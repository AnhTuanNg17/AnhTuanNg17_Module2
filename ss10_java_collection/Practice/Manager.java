package ss10_java_collection.Practice;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        int choice;
        do {
            System.out.println("-----Main menu-----\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "7. Quay lại ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    productManagement.add();
                    break;
                }
                case 2: {
                    productManagement.edit();
                    break;
                }
                case 3: {
                    productManagement.remove();
                    break;
                }
                case 4: {
                    productManagement.display();
                }
                case 5: {
                    productManagement.find();
                }
                case 6: {
                    productManagement.sort();
                }
                default: {
                    System.out.println("Enter again: ");
                    break;
                }
            }
        }
        while (choice != 0);
        {
            }
        }
    }

