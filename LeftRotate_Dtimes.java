public class LeftRotate_Dtimes {
    //for naive solution we can run a loop till d and pass the function for which it to rotate the array 1 by 1
     
    //for efficient we copy d elements to a temporary array like how we were doing it for normal array
    static void leftRotate(int arr[],int d,int n)
    {
        reverse(arr, 0, d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int arr[],int low,int high)
    {
        int t;
        while(low<high)
        {
           t=arr[low];
           arr[low]=arr[high];
           arr[high]=t;

           high--;
           low++;
          
        }
    }
    static public void main(String args[])
    {
         int arr[]={34,65,87,89,12,54,76};
         int d=3,n=arr.length;
         leftRotate(arr, d, n);
         for(int i=0;i<n;i++)
         System.out.print(arr[i]+" ");
    }
    
}
