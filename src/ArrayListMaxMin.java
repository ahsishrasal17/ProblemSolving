import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMaxMin {
    /**
     Given an integer ArrayList arr[], find maximum and minimum elements in the ArrayList.

     Input: arr[] = [5, 4, 2, 1]
     Output: 5 1
     Explanation: Maximum element is: 5. Minimum element is: 1

     Input: arr[] = [8]
     Output: 8 8
     Explanation: Maximum element is: 8. Minimum element is: 8

     https://www.geeksforgeeks.org/problems/max-and-min-in-arraylist/1
     */
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(56,34,22,49,15,66,92));
        ArrayListMaxMin obj = new ArrayListMaxMin();
        int[] arr = obj.minMaxElement(list);
        System.out.println("Minimum Element in ArrayList : " + arr[0]);
        System.out.println("Maximum Elelemnt in ArrayList : " + arr[1]);
    }

    public int[] minMaxElement(ArrayList<Integer> list){
        int min = list.get(0);
        int max = list.get(0);
        for(int i=0; i<list.size();i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return new int[] {min,max};
    }
}
