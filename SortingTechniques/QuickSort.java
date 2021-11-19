package SortingTechniques;


public class QuickSort {
    //swap function
    static void swap(int[] arr, int i, int j){

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    
    static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=(low -1);

        for(int j=low; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return(i+1);
    }

    static void sort(int[] arr, int low, int high){
        if(low<high){
            int p=partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }




    public static void main(String args[]){
        int arr[]={3,43,54,65,30,10,110,50,2,0,7}; //Given array
        System.out.println("Array Before Sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

      
        sort(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting");

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }    
    }
}
