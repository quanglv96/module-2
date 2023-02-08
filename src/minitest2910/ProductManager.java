package minitest2910;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
//    ArrayList<Product> listProduct = new ArrayList<>();
    static  ArrayList<Product> listProduct=new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public ArrayList<Product> copyarray(){
        listProduct=Run.arrRun;
        return listProduct;
    }
    public ArrayList<Product> createProduct() {
        System.out.println("Create Product");
        System.out.println("Input id product");
        long id = input.nextLong();
        input.nextLine();
        System.out.println("Input name product");
        String name = input.nextLine();
        System.out.println("Input price product");
        double price = input.nextDouble();
        System.out.println("Input quantity product");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.println("Input category product");
        Category category = new Category(input.nextLine());
        listProduct.add(new Product(id, name, price, quantity, category));
        System.out.println(category.getCategory());
        System.out.println("Thêm sản phẩm thành công!");
        return listProduct;
    }
    public ArrayList<Product> removeProduct(){
        System.out.println("Remove Product by ID");
        System.out.println("Enter ID: ");
        int countDel=0;
        long idDel=input.nextLong();
        for(int i=0; i<listProduct.size();i++){
            if(idDel==listProduct.get(i).getId()){
                listProduct.remove(i);
                countDel++;
            }
        }
        if(countDel>0){
            System.out.println("Đã xóa thành công "+countDel+" sản phẩm có ID: "+idDel);
        }else{
            System.out.println("Không tim thấy ID: "+idDel+ " trong danh mục sản phẩm");
        }
        return listProduct;
    }
    public ArrayList<Product> updateProduct() {
        System.out.println("Update Product by ID");
        System.out.println("Enter ID: ");
        long idUP = input.nextLong();
        int countUP=0;
        int indexUP = 0;
        for (int i = 0; i < listProduct.size(); i++) {
            if (idUP == listProduct.get(i).getId()) {
                indexUP = i;
                countUP++;
                break;
            }
        }
        if(countUP==0){
            System.out.println("ID không có trong danh sách");
        }else {
            System.out.println("Thông tin cũ: " + listProduct.get(indexUP).toString());
            System.out.println("Input new ID");
            Long newID= input.nextLong();
            input.nextLine();
            System.out.println("Input new name");
            String newName = input.nextLine();
            System.out.println("Input new price");
            double newPrice = input.nextDouble();
            System.out.println("Input new quantity");
            int newQuantity = input.nextInt();
            input.nextLine();
            System.out.println("Input new category");
            Category newCategory=new Category(input.nextLine());
            listProduct.set(indexUP,new Product(newID,newName,newPrice,newQuantity,newCategory));
            System.out.println("Update thành công!");
            System.out.println(listProduct.get(indexUP).toString());
        }
        return listProduct;
    }
    public void displayProduct(){
        for(int i=0;i< listProduct.size();i++){
            System.out.println(listProduct.get(i).toString());
        }
    }
    public void oneProduct(){
        System.out.println("Enter ID: ");
        long idDisplay = input.nextLong();
        int countDisplay=0;
        for(int i=0;i<listProduct.size();i++){
            if(idDisplay==listProduct.get(i).getId()){
                countDisplay++;
                System.out.println(listProduct.get(i).toString());
                break;
            }
        }
        if(countDisplay==0){
            System.out.println("ID "+idDisplay+" không có trong danh mục sản phẩm");
        }
    }
    public void sortCategory(){
        System.out.println("Enter category:");
//        String sort=input.nextLine();
        String sort="Điện tử";
        System.out.println(sort);
        int countC=0;
        for(int i=0;i< listProduct.size();i++){
            if(sort==listProduct.get(i).getCategory().getCategory()){
                System.out.println(listProduct.get(i).toString());
                countC++;
            }
        }
        if(countC==0){
            System.out.println("Không tìm thấy sản phẩm nào tương ứng");
        }
    }
    public void totalPrice(){
        double sumPrice=0;
        for(int i=0;i< listProduct.size();i++){
            sumPrice+=listProduct.get(i).totalProduct();
        }
        System.out.println("Tổng giá trị sản phẩm(Price*Quatity): "+sumPrice);
    }
    public void sortPrice100(){
        int countPrice100=0;
        for(int i=0;i<listProduct.size();i++){
            if(100<listProduct.get(i).getPrice()){
                countPrice100++;
                System.out.println(listProduct.get(i).toString());
            }
        }
        if(countPrice100==0){
            System.out.println("Không có sản phẩm nào có giá lớn hơn 100");
        }
    }
    public void sortPriceCategory(){
        int countPC=0;
        for(int i=0;i<listProduct.size();i++){
            if((200<listProduct.get(i).getPrice())&&"Điện tử"==listProduct.get(i).getCategory().getCategory()){
                System.out.println(listProduct.get(i).toString());
                countPC++;
            }
        }
        if(countPC==0){
            System.out.println("Không có sản phẩm nào có giá lớn hơn 200 và là loại 'Điện tử'");
        }
    }
}
