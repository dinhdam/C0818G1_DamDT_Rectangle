public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height * this.height) * 2;

    }

    public void Display() {
        System.out.println("dien tich hinh chu nhat:" + this.getArea());
        System.out.println("chu vi hinh chu nhat :" + this.getPerimeter());
    }
}
