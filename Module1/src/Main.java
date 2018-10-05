import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu width:");
        double width = sc.nextDouble();
        System.out.println("nhap vao chieu height:");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("your Retangle\n " + rectangle.getPerimeter());
        System.out.println(" dien tich hinh chu nhat la:" + rectangle.getArea());
        System.out.println("chu vi hinh chu nhat la:" + rectangle.getPerimeter());
    }
}
