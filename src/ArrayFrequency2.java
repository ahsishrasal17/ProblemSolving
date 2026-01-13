public class ArrayFrequency2 {
    public static void main(String[] args)
    {
        int[] arr = {30,50,20,80,70,30,50,50};
        ArrayFrequency2 obj = new ArrayFrequency2();
        System.out.println(obj.frequency(arr));
    }

    public int frequency(int[] arr){
        int currCount = 1, maxCount = 1, res = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] == arr[i-1]){
                currCount++;
            }else
                currCount = 1;

            if(currCount > maxCount || (currCount == maxCount && arr[i] > res)){
                maxCount = currCount;
                res = arr[i];
            }
        }
        return res;
    }
}
