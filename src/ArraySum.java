public class ArraySum
{
    public static void main(String[] args)
    {
        int arr[] = {3, 6, 9, 4, 7};
        ArraySum obj = new ArraySum();
        obj.addition(arr);
    }

    public void addition(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}


