package demo;

import javax.swing.*;

public class Run2 extends Run1 {
    public static void main(String[] args) {
        Run1 run1=new Run1();
        JOptionPane num= run1.test();
        System.out.println(num);
    }
}
