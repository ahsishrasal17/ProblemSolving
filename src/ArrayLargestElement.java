public class ArrayLargestElement {
    /**
    Given an array arr[]. The task is to find the largest element and return it.

     Input: arr[] = [1, 8, 7, 56, 90]
     Output: 90
     Explanation: The largest element of the given array is 90.

     Input: arr[] = [5, 5, 5, 5]
     Output: 5
     Explanation: The largest element of the given array is 5.

     https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
    */

    public static void main(String[] args)
    {
        int[] arr = {5,90,70,20};
        ArrayLargestElement obj = new ArrayLargestElement();
        int result = obj.largestElement(arr);
        System.out.println(result);
    }

    public int largestElement(int[] arr){
        int max = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
