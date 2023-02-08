package minitest1210;

import java.util.Scanner;

public class ProductManager {
    static int count = 0;
    static Product[] array = new Product[count + 1];

    //        static Product[] array = new Product[20];
    public ProductManager() {
    }

    public ProductManager(Product[] array) {
        this.array = array;
    }

    public Product[] getArray() {
        return array;
    }

    public void setArray(Product[] array) {
        this.array = array;
    }

    public void addArray() {
        Product[] newArray = new Product[count + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < count) {
                newArray[i] = array[i];
            }
        }
        setArray(newArray);
    }

    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Thêm sản phẩm");
        System.out.println("Tên sản phẩm");
        String name = input.nextLine();
        System.out.println("Giá sản phẩm");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("Mô tả sản phẩm");
        String description = input.nextLine();
        if (count == array.length) {
            addArray();

        }
        array[count] = new Product(name, price, description);
        count++;
    }

    public void reMake(int num) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tên sản phẩm cũ" + array[num].getName());
        System.out.println("Cập nhập Tên sản phẩm mới:");
        String newName = input.nextLine();
        array[num].setName(newName);
        System.out.println("Giá cũ" + array[num].getDescription());
        System.out.println("Cập nhập giá mới:");
        int newPrice = input.nextInt();
        array[num].setPrice(newPrice);
        System.out.println("Mô tả cũ" + array[num].getDescription());
        System.out.println("Cập nhập mô tả mới:");
        String newDes = input.nextLine();
        array[num].setDescription(newDes);
    }

    public void deleteProduct(int num) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == num) {
                count++;
            }
            if (i == array.length - 1) {
                array[i] = new Product("", 0, "");
            } else {
                array[i] = array[i + count];
            }
        }
    }

    public void displayProduct() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(i + ": " + array[i].show());
            } else {
                break;
            }

        }
    }

    public static String maxPrice() {
        int max = (int) array[0].getPrice();
        int numMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (max < ((int) array[i].getPrice())) {
                    max = (int) array[i].getPrice();
                    numMax = i;
                }
            } else {
                break;
            }
        }
        return "Thông tin sản phẩm có giá cao nhất: " + array[numMax].show();
    }
}
