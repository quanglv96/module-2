package minitest2910;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
   static ProductManager productManager=new ProductManager();
    static ArrayList<Product> arrRun = new ArrayList<>();
    public static void main(String[] args) {
        arrRun.add(new Product(1L,"Điều hòa",140,45,new Category("Điều hòa")));
        arrRun.add(new Product(2L,"Điều thoại",210,41,new Category("Điện tử")));
        arrRun.add(new Product(3L,"Laptop",300,15,new Category("Điện tử")));
        productManager.copyarray();
        System.out.println(" Product Manager");
        int choice =-1;
        Scanner input =new Scanner(System.in);
        while (choice!=0){
            System.out.println("book1. Create Product");
            System.out.println("2. Remove Product by ID");
            System.out.println("3. Update Product by ID");
            System.out.println("4. Display one Product by ID");
            System.out.println("5. Display all Product");
            System.out.println("6. Sort by Category");
            System.out.println("7. Total Product");
            System.out.println("8. Display Price>100");
            System.out.println("9. Display Price>200 and Category is 'Điện tử'");
            System.out.println("Nhập lựa chọn của bạn");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    productManager.createProduct();
                    break;
                case 2:
                    productManager.removeProduct();
                    break;
                case 3:
                    productManager.updateProduct();
                    break;
                case 4:
                    productManager.oneProduct();
                    break;
                case 5:
                    productManager.displayProduct();
                    break;
                case 6:
                    productManager.sortCategory();
                    break;
                case 7:
                    productManager.totalPrice();
                    break;
                case 8:
                    productManager.sortPrice100();
                    break;
                case 9:
                    productManager.sortPriceCategory();
                    break;


            }
        }
    }
}
