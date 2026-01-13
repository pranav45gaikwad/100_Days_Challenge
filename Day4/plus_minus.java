import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double pCount=0,nCount=0,zCount=0;
    for(int i=0;i<arr.size();i++)
    {
        if(arr.get(i)>0) pCount++;
        else if(arr.get(i)<0) nCount++;
        else zCount++;
    }
    
    System.out.printf("%,.6f",pCount/(double)arr.size());
    System.out.printf("\n%,.6f",nCount/(double)arr.size());
    System.out.printf("\n%,.6f",zCount/(double)arr.size());

    }

}

public class plus_minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
