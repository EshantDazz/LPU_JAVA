public class ReverseArray {
    static void sortArray(int arr[])
    {
        int l=0,h=arr.length-1,t;
        while(l<h)
        {
             t=arr[l];
             arr[l]=arr[h];
             arr[h]=t;
             l++;
             h--;
        }
        System.out.println("Array after reversing = ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

    }
    static public void main(String args[])
    {
        int arr[]={23,54,76,98};
        System.out.println("Oroginal Array = ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        sortArray(arr);

     }   
}
