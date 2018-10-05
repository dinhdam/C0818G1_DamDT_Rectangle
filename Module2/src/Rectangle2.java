public class Rectangle2 {
    double wight,height;
    public Rectangle2(){
    }
    public Rectangle2(double wight,double height){
        this.height = height;
        this.wight=wight;
    }
    public double getArea(){
        return this.wight*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.wight)*2;
    }
    public void Display (){
        System.out.println("dien tich hinh chu nhat :"+ this.getArea());
        System.out.println("chu vi hinh chu nhat :"+this.getPerimeter());
    }
}
