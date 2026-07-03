class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int left=0;
        int right= arr.length-1;
        int index=0;

        while (left <= right) {
            index = left + (right - left) / 2;
            if (arr[index] == x) {
                break;
            }
            else if (arr[index] > x) {
                right = index - 1;
            }
            else {
                left = index + 1;
            }
        }

        System.out.println(index);

        ArrayList <Integer> list = new ArrayList <>();
        int diff =0;

        
        if (left > right) {
            int temp = right;
            right = left;
            left = temp;
        } else {
            left = index-1;
            right=index; 
        }
        while (k >0){

            if (left <0){
                list.add(arr[right]);
                right++;
                k--;
                continue;
            }

            if (right >= arr.length){
                list.add(arr[left]);
                left--;
                k--;
                continue;
            }

            diff=Math.abs(x-arr[left]);
            System.out.println("left = "+ left + "right="+right+"diff="+diff);

            if (Math.abs(x-arr[right])< diff){
                list.add(arr[right]);
                right++;
            }
            else{
                list.add(arr[left]);
                left--;
            }

            k--;
        }

        Collections.sort(list);

        return list;
    }
}