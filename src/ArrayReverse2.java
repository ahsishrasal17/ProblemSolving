import java.util.Arrays;

public class ArrayReverse2 {
    /**
     You are given an array of integers arr[]. You have to reverse the given array.
     Note: Modify the array in place.

     Input: arr = [1, 4, 3, 2, 6, 5]
     Output: [5, 6, 2, 3, 4, 1]
     Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. After reversing the array, the first element goes to the
     last position, the second element goes to the second last position and so on. Hence, the answer is [5, 6, 2, 3, 4, 1].

     Input: arr = [4, 5, 2]
     Output: [2, 5, 4]
     Explanation: The elements of the array are [4, 5, 2]. The reversed array will be [2, 5, 4].
     */

    public static void main(String[] args)
    {
        int arr[] = {0,2,4,6,8};
        System.out.println("Original Array : " + Arrays.toString(arr));
        ArrayReverse2 obj = new ArrayReverse2();
        int[] arr1 = obj.reverse(arr);
        System.out.println("Reversed Array : " + Arrays.toString(arr1));
    }

    public int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
