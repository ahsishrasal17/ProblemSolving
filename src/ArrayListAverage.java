import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAverage {
    /**
     You are given a ArrayList list[] that contains integers. You need to return average of the non-negative integers.

     Input: list = [-12, 8, -7, 6, 12, -9, 14]
     Output: 10.0
     Explanation: The positive numbers are 8 6 12 14. The sum is 8+6+12+14 = 40, Average = 40/4 = 10.0

     Input: list = [1, 2, 3]
     Output: 2.0
     Explanation: The positive numbers are 1 2 3. The sum is 1+2+3 = 6, Average = 6/3 = 2.0

     https://www.geeksforgeeks.org/problems/average-of-an-arraylist--141628/1
     * */

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(92,2,74,55,0,10,-60,24,91,-67,11));
        ArrayListAverage obj = new ArrayListAverage();
        System.out.println(obj.average(list));
    }

    public double average(ArrayList<Integer> list){
        int count = 0;
        double average = 0.0;
        int sum = 0;
        for(int i=0; i<list.size();i++){
            if(list.get(i) >= 0){
                sum = sum + list.get(i);
                count++;
            }
        }
        average = (double) sum / count;
        return average;
    }
}
