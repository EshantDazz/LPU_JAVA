public class RemoveDuplicatesSortedArray {
    static public void main(String args[])
    {
        int arr[]={10,20,20,30,30,30,50,100};
        int n=arr.length;
        System.out.println("Original Array = ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

        int r=1;
        for(int i=1;i<n;i++)
        {
            if(arr[r-1]!=arr[i])
            {
                arr[r]=arr[i];
                r++;
            }
        }
        System.out.println("After Removing Duplicates  = ");
        for(int i=0;i<r;i++)
        System.out.print(arr[i]+" ");


    }
    
}
