  import java.util.Scanner;

public class Area_of_circle {

    public static void main(String[] args) {
        
        double radius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Radius of Circle : ");
        radius = sc.nextDouble();

        double area = 3.141592*radius*radius;

        System.out.println("The area of the radius of circle "+radius+" = "+area);

        sc.close();
    }
}
