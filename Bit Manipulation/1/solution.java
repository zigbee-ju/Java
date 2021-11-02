//Java program to find the array element that appears only once
import java.util.Scanner;

public class solution{
    static int single(int ar[], int size){
        //Do XOR of all elements and return
        int res = ar[0];
        for(int i = 1; i < size; i++)
            res = res ^ ar[i];
        return res;
    }
    //Driver code
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the array:");
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();            
        }
        int ans = single(arr, n);
        System.out.println("The element that appears once in an array:" + ans);
    }
}