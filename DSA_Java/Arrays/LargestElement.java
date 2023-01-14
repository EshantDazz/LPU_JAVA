public class LargestElement {
    static int getLargest(int arr[])
    {
        int res=0;
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[res])
            res=i;
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[]={43,676,870,23,54};
        int pos=getLargest(arr);
        System.out.println("Index of the Largest element of array = " + pos);

    }
}
