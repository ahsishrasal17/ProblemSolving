public class ArrayFrequency
{

    public static void main(String[] args)
    {
        int[] arr = {30,50,40,50,30,30,50};
        ArrayFrequency obj = new ArrayFrequency();
        //obj.frequency(arr);
        System.out.println(obj.frequency(arr));
    }

    public int frequency(int[] arr){
        int maxcount = 0;
        int res = 0;

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxcount || (count == maxcount && arr[i] > res)){
                maxcount = count;
                res = arr[i];
            }
        }
        return res;
    }
}
