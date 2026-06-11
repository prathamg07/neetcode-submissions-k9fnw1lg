    void swap(int [] arr  , int low , int high){
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
void quicksort (int[] arr, int low , int high){
    if (high <= low ){
        return ;
    }

        int mid = (low + high) / 2;
    if (arr[low] > arr[mid])  swap(arr, low, mid);
    if (arr[low] > arr[high]) swap(arr, low, high);
    if (arr[mid] < arr[high]) swap(arr, mid, low);

        int pivot = low;
        int i=low+1;
        int j =high;

        do{
        while ( i<j && arr[i]<=arr[pivot] ){i++;}
        while (j>low && arr[j]> arr[pivot]){j--;}
            
        if (j>i){
            swap(arr,i,j);
        }
        }
        while (i<j);

        swap(arr,pivot,j);

        quicksort(arr , low , j-1 );
        quicksort(arr,j+1,high);


}


class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;        
        
    }
}