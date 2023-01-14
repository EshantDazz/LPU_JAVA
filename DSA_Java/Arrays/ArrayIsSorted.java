public class ArrayIsSorted {
    static boolean isSorted(int arr[])
    {
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
    static public void main(String args[])
    {
        int arr[]={20,50,110,60,100};
        System.out.println(isSorted(arr));
    }
    
}
