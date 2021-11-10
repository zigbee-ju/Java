import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayApp{
    public static List<List<Integer>> findTriplets(int[] arr, int targetSum){
        Arrays.sort(arr);
        List<List<Integer>> alltriplets = new ArrayList<>();

        for(int i = 0; i < arr.length - 2; i++){
            int sum = targetSum - arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            while(start<end){
                int t = arr[start] + arr[end];
                if(t>sum){
                    end--;
                }
                else{
                    for(int x = start + 1; x <=end; x++){
                        alltriplets.add(Arrays.asList(arr[i], arr[start], arr[x]));
                    }
                    start++;
                }
            }
        }
        return alltriplets;
    }

    public static void main(String[] args){
        int arr[] = {2, 7, 4, 9, 5, 1, 3};
        System.out.println("The triplets formed are:");
        System.out.println(ArrayApp.findTriplets(arr, 10));
    }
}