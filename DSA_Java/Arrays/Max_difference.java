public class Max_difference {
    
    public static void main(String args[])
    {
        int arr[]={2,3,10,6,4,8,1};
        int n=arr.length;
        int res=arr[1]-arr[0];
        int min=arr[0];
        for(int j=1;j<n;j++)
        {
            res=Math.max(res,arr[j]-min);
            min=Math.min(min,arr[j]);
        }
        System.out.println(res);
    }
}
