package introductiontoJava;

import java.util.Date;//tạo book1 đối tượng date cho thời gian hiện tại
public class SystemTime {
    public static void main(String[] args) {
        Date now=new Date();
        System.out.println("Now is: "+ now);
    }
}
