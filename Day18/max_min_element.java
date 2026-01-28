import java.util.Scanner;

public class max_min_element {

    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        // Array Input :
         int size;
        
        System.out.print("\n Enter the No. of Elements :");
        size = input.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter "+size+" Elements :");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }

        // 
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

        System.out.print("\n The Maximum Element in Array = "+max+" & Minimum Element = "+min);

        input.close();
    }
    
}
