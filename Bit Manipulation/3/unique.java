//Java program for finding the two non-repeating elements in an array of repeating elements
import java.util.Scanner;

public class unique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        solution(arr);
    }    
    
    //This function sets the values of *x and *y to non-repeating elements in an array arr[] of size n
    public static void solution(int[] arr){
        int xxory = 0;
        for(int val : arr)
            //XOR all the elements of the array; all the elements occurring twice will cancel out each other remaining two unique numbers will be xored
            xxory = xxory ^ val;
        
        //This will give us the sum containing only the rightmost set bit
        int rsbm = xxory & -xxory;

        //x and y will contain 2 unique elements respectively
        int x = 0;
        int y = 0;

        //traversing the array again
        for(int val:arr){

            //Two possibilities either result == 0 or result > 0
            if((val & rsbm) == 0)
                x = x ^ val;
            else    
                y = y ^ val;
        }
        // print the the two unique numbers
        System.out.println(x + ", " + y);
    }
    
    
    
}
