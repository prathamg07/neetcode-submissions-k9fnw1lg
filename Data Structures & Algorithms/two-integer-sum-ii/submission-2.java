class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left =0;
        int right = numbers.length-1;

        int [] arr = new int [2];

        while (right < numbers.length){

            if (numbers[right]+numbers[left]==target){

                arr[0]=left+1;
                arr[1]=right+1;
                break;

            }

            while (right>left && (numbers[right]+numbers[left])>target){
                right--;
            }

            while (right > left && (numbers[right]+numbers[left])<target){
                left++;
            }

        }

        return arr;
        
    }
}
