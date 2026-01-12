public class ArrayOrderCheck {
    /**
     Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

     Input: arr[] = [10, 20, 30, 40, 50]
     Output: true
     Explanation: The given array is sorted.

     Input: arr[] = [90, 80, 100, 70, 40, 30]
     Output: false
     Explanation: The given array is not sorted.
     */

    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        ArrayOrderCheck obj = new ArrayOrderCheck();
        System.out.println(obj.checkOrder(arr));
    }

    public boolean checkOrder(int[] arr){
        for( int i=1; i< arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
