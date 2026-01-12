public class ArraySearch
{
    /**
    Given an array, arr[] of n integers, and an integer element x, find whether element x is present in the array.
    Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

     Input: arr[] = [1, 2, 3, 4], x = 3
     Output: 2
     Explanation: For array [1, 2, 3, 4], the element to be searched is 3. Since 3 is present at index 2, the output is 2.

     Input: arr[] = [10, 8, 30, 4, 5], x = 5
     Output: 4
     Explanation: For array [10, 8, 30, 4, 5], the element to be searched is 5 and it is at index 4. So, the output is 4.

     https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    */
    public static void main(String[] args)
    {
        int[] arr = {1,4,5,7,9};
        int x = 9;
        ArraySearch obj = new ArraySearch();
        int result = obj.search(arr, x);
        System.out.println(result);
    }

    public int search(int[] arr, int x){
        int b = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == x){
                b = i;
            }
            else b = -1;
        }
        return b;
    }
}
