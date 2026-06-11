void quicksort (int[] arr, int low , int high){
    if (high <= low ){
        return ;
    }

        int pivot = low;
        int i=low+1;
        int j =high;

        do{
        while ( i<j && arr[i]<=arr[pivot] ){i++;}
        while (j>low && arr[j]> arr[pivot]){j--;}
            
        if (j>i){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
        while (i<j);

        int temp = arr[pivot];
        arr[pivot] = arr[j] ;
        arr[j]= temp;

        quicksort(arr , low , j-1 );
        quicksort(arr,j+1,high);


}


class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;        
        
    }
}