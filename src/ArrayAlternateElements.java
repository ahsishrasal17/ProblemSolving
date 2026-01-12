import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAlternateElements
{
    /**
     You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).

     Input: arr[] = [1, 2, 3, 4]
     Output: 1 3
     Explanation:
     Take first element: 1
     Skip second element: 2
     Take third element: 3
     Skip fourth element: 4

     https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1
     **/

    public static void main(String[] args)
    {
        int arr[] = {1,3,5,7,9};
        ArrayAlternateElements obj = new ArrayAlternateElements();
        ArrayList<Integer> obj1 = obj.alternates(arr);
        System.out.println(obj1);
    }

    public ArrayList<Integer> alternates(int[] arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            if(i%2 == 0){
                arr1.add(arr[i]);
            }
        }
        return arr1;
    }
}
