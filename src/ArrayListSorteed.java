import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSorteed {
    /**
     Given an ArrayList list, check if it is sorted or not. It should be in sorted ascending or descending order.

     Input: list = [1, 3, 56, 99]
     Output: Sorted
     Explanation: The given arraylist is sorted in ascending order.

     Input: list = [13, 12, 11, 11]
     Output: Sorted
     Explanation: The given arraylist is sorted in descending order.

     https://www.geeksforgeeks.org/problems/check-sorted-arraylist/1
     */
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,4));
        ArrayListSorteed obj = new ArrayListSorteed();
        boolean result = obj.sorted(list);
        if(result){
        System.out.println("Sorted");
        }else
        System.out.println("Unsorted");
    }

    public boolean sorted(ArrayList<Integer> list){
        boolean asc = true;
        boolean desc = true;
        for(int i = 1; i<list.size();i++){
            if(list.get(i) < list.get(i-1)){
                asc = false;
            }
            if(list.get(i) > list.get(i-1)){
                desc = false;
            }
        }
        return asc || desc;
    }
}
