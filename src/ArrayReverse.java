import java.util.Arrays;

public class ArrayReverse {
    /**
     You are given an array of integers arr[]. You have to reverse the given array.
     Note: Used brute force.

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
        int[] a = {1,3,5,7,9};
        ArrayReverse obj = new ArrayReverse();
        System.out.println("Original Array : " + Arrays.toString(a));
        obj.reverse(a);
        System.out.println("Reversed Array : " + Arrays.toString(a));
    }

    public void reverse(int[] a){
        int[] b = a.clone();
        int n = a.length;
        for(int i=0; i<a.length; i++){
            a[i] = b[n - 1 - i];
        }
    }
}
