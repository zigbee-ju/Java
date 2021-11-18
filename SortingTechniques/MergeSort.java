package SortingTechniques;

public class MergeSort{


    void merge(int [] arr,int left, int mid, int right){
        //size of subarrays
        int s1=mid-left+1;
        int s2=right-mid;
       //Temporary arrays
        int[] L=new int[s1];
        int[] R=new int[s2];
       //Copying data to temp arrays
        for(int i=0; i<s1; i++ ){
            L[i]=arr[left+i];
        }
        for(int j=0; j<s2; j++){
            R[j]=arr[mid+1+j];
        }
        //Merging logic 
       int i=0,j=0;
       int k=left;
       while(i<s1 && j<s2){
           if(L[i]<=R[j]){
               arr[k]=L[i];
               i++;
           }
           else{
               arr[k]=R[j];
               j++;
           }
           k++;
       }
       while(i<s1){
           arr[k]=L[i];
           i++;
           k++;
       }
       while(j<s2){
           arr[k]=R[j];
           j++;
           k++;
       }


   }
    void sort(int[] arr, int left, int right){
        if(left<right){
            int mid=(left+right)/2;

            sort(arr, left, mid);
            sort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }
    
    //Driver Code
    public static void  main(String[] args) {
        int arr[]={3,43,54,65,30,10,110,50,2,0,7}; //Given array
        System.out.println("Array Before Sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Array After Sorting");
        MergeSort ms =new MergeSort();
        ms.sort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}