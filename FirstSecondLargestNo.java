import java.util.*;
public class FirstSecondLargestNo {


   public static void main(String[] args) {

      int arr[] = {5, 41, 11, 21, 32, 27};
    
      int n = arr.length;
      Arrays.sort(arr);
      
      int p = arr[n - 2];
      System.out.println("The second largest element of an array is: " + p);
      Arrays.sort(arr);
     
      int q = arr[n - 1];
      System.out.println("The largest element of an array is: " + q);
      
      
      int r = q - p;
      System.out.println("The difference of largest and second largest element of an array is: " + r);
   }
}
