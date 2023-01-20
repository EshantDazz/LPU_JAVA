public class MAximum_SUM_subarray {
    static int maxSum(int arr[])
    {
        int n =arr.length;
        int res=arr[0],max=arr[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(arr[i],arr[i]+max);
            res=Math.max(res,max);
        }
        return res;

    }
    static public void main(String args[])
    {
         int arr[]={-3,8,-2,4,-5,6};
         int res=maxSum(arr);
         System.out.println(res);
    }
    
}
