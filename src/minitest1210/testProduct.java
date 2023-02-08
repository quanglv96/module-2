package minitest1210;

import java.util.Scanner;
public class testProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Product Manager");
        ProductManager productManager=new ProductManager();
        int choice = -1;
        while (choice != 0) {
            System.out.println("book1. Thêm mới sản phẩm");
            System.out.println("2. Chỉnh sửa mô tả sản phẩm theo index");
            System.out.println("3. Xóa book1 sản phẩm");
            System.out.println("4. Hiển thị danh mục sản phẩm");
            System.out.println("5. Sản phẩm giá cao nhất");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.println("Vị trí sản phẩm bạn muốn chỉnh sửa");
                    int num2 = input.nextInt();
                    productManager.reMake(num2);
                    break;
                case 3:
                    System.out.println("Vị trí sản phẩm bạn muốn xóa");
                    int num3 = input.nextInt();
                    productManager.deleteProduct(num3);
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách sản phẩm");
                    productManager.displayProduct();
                    break;
                case 5:
                    System.out.println(ProductManager.maxPrice());
                    break;
            }
        }
    }


}
