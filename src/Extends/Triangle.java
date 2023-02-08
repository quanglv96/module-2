package Extends;

public  class Triangle {
    private double side1=1;
    private double side2=1;
    private double side3=1;
   private Triangle(){
   }
   private Triangle(double side1,double side2,double side3){
       this.side1=side1;
       this.side2=side2;
       this.side3=side3;
   }
   public void setSide1( double side1){
       this.side1=side1;
   }
   public double getSide1(){
       return this.side1;
   }
    public void setSide2( double side2){
        this.side2=side2;
    }
    public double getSide2(){
        return this.side2;
    }
    public void setSide3( double side3){
        this.side3=side3;
    }
    public double getSide3(){
        return this.side3;
    }
    public double getArea(){
       double p=(getSide1()+getSide2()+getSide3())/2;
//       double s=p*(p-getSide1())*(p-getSide2())*(p-getSide3());
       return Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
    }
    public double getPerimeter(){
       return getSide1()+getSide2()+getSide3();
    }
    public String toString(){
       return "Tam giác với 3 canh có độ dài: "+getSide1()+", "+getSide2()+", "+getSide3()+" có diện tích là: "+getArea()+" và chu vi là: "+getPerimeter();
    }
}
