import java.util.Scanner;

public class _479A_expression{

    public static void main(String[] args) {
        
        int a,b,c;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int w = a+b*c;
        int x = a*(b+c);
        int y = a*b*c;
        int z = (a+b)*c;
        int d=a+b+c;
    
     if(w>=x && w>=y && w>=z  && w>=d)
     {
        System.out.println(w);
     }
     else if(x>=w && x>=y && x>=z && x>=d)
      System.out.println(x);
    else if(y>=w && y>=x && y>=z && y>=d)
        System.out.println(y);
     else if(z>=w && z>=x && z>=y && z>=d)
        System.out.println(z);
    else
        System.out.println(d);
    }
   
}