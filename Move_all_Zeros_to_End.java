public class Move_all_Zeros_to_End {
    static void pushZeros(int arr[],int n)
    {
        int t;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                t=arr[i];
                arr[i]=arr[c];
                arr[c]=t;
                c++;  
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    static public void main(String args[])
    {
        int arr[]={34,65,0,0,12,45,67,0};
        int n=arr.length;
        pushZeros(arr, n);

    }
    
}
