package SortingTechniques;

public class BubbleSort {
    
    //Sorting Logic 
    void bubbleSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //Swapping Logic
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //Driver Code   
    public static void main(String args[]){
        int arr[]={3,43,54,65,30,10,110,50,2,0,7}; //Given array
        System.out.println("Array Before Sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        BubbleSort bs= new BubbleSort();
        bs.bubbleSort(arr);
        System.out.println("Array After Sorting");

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
