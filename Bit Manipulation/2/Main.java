//Java progam to find unique element where every element appears k times except one
import java.util.Scanner;

public class Main {
    static int findUnique(int a[], int n, int k){
        //Create a count array to store count of numbers that have a particular bit set.
        byte sizeofint = 4;
        int int_size = 8 * sizeofint;
        int count[] = new int[int_size];

        //AND(bitwise) each element of the array with each set digit (one at a time) to get the count of set bits at each position
        for(int i = 0; i < int_size; i++)
            for(int j = 0; j < n; j++)
                if (((a[j]) & (1<<i)) != 0)
                    count[i]+=1;
        
        //Considering all bits whose count is not multiple of k to form the required number.
        int res = 0;
        for(int i = 0; i < int_size; i++)
            res += (count[i]%k) * (1<<i);
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
        System.out.println("Enter the value for k:");
        int k = sc.nextInt();
        int ans = findUnique(arr, n, k);
        System.out.println("The unique element in an array where all other elements occur "+k+" times is:"+ ans);        
    }
}
