package introductiontoJava;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        inPut(); //lưu giá trị a nhập vào
        checkNumber();
    }

    public static int inPut() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void checkNumber() {
        int number = inPut();
        if(number>=20) {
            if (number / 100 > 0) {
                int hangTram = (number / 100);
                int hangChuc = (number - hangTram * 100);
                texthangTram(hangTram);
                texthangchuc(hangChuc);
                System.out.println(hangChuc);
                System.out.println(hangTram);
            } else {
                texthangchuc(number);
            }
        } else {
            textDuoi20(number);
        }
    }
    public static void texthangTram(int value) {
        String readhangTram;
        switch (value) {
            case 1:
                readhangTram = "One hundred";
                break;
            case 2:
                readhangTram = "Two hundred";
                break;
            case 3:
                readhangTram = "Three hundred";
                break;
            case 4:
                readhangTram = "Four hundred";
                break;
            case 5:
                readhangTram = "Five hundred";
                break;
            case 6:
                readhangTram = "Six hundred";
                break;
            case 7:
                readhangTram = "Seven hundred";
                break;
            case 8:
                readhangTram = "Eight hundred";
                break;
            case 9:
                readhangTram = "Nine hundred";
                break;
        }
    }
    public static void texthangchuc(int value) {// value : hàng chục
        int hangDonvi= value%10;
        value=(value-hangDonvi)/10;
        String readhangChuc;
        switch (value) {
            case 2:
                readhangChuc = "Twenty";
                break;
            case 3:
                readhangChuc = "Thirty";
                break;
            case 4:
                readhangChuc = "Forty";
                break;
            case 5:
                readhangChuc = "Fifty";
                break;
            case 6:
                readhangChuc = "Sixty";
                break;
            case 7:
                readhangChuc = "Seventy";
                break;
            case 8:
                readhangChuc = "Eighty";
                break;
            case 9:
                readhangChuc = "Ninety";
                break;
        }
    }
    public static void textDuoi20(int value){
        
    }
}