import java.util.ArrayList;

public class ArraySmallerElements {
    /**
     Given an array arr . Return all the elements which are less than to given element target. Your task is to return an
     ArrayList to the given function getSmaller() having all smaller elements in order of their occurance.

     Input: arr[] = [54, 43, 2, 1, 5], x = 7
     Output: 2 1 5
     Explanation: 2, 1, 5 are smaller than 7.

     Input: arr[] = [324, 5, 2, 2], x = 3
     Output: 2 2
     Explanation: 2, 2 are smaller than 3.

     https://www.geeksforgeeks.org/problems/get-smaller-elements/1
     */
    public static void main(String[] args)
    {
        int[] arr = {54,43,2,1,5};
        int x = 7;
        ArraySmallerElements obj = new ArraySmallerElements();
        ArrayList<Integer> list = obj.smallerElement(arr,x);
        System.out.println(list);
    }

    public ArrayList<Integer> smallerElement(int[] arr, int x){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] < x){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
