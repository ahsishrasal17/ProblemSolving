public class ArrayFrequency3 {
    public static void main(String[] args)
    {
        char arr[] = {'a','s','h','i','s','h','r','a','s','a','l'};
        ArrayFrequency3 obj = new ArrayFrequency3();
        System.out.println(obj.frequency(arr));
    }

    public char frequency(char[] arr){
        int currCount = 1, maxCount = 1;
        char res=arr[0];
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
