public class Leaders_in_Array {
    public static void main(String args[])
    {
        int arr[]={7,20,4,20,6,5,3};
        int n=arr.length;
        int cur_leader=arr[n-1];
        System.out.print(cur_leader+" ");
        for(int i=n-2;i>=0;i--)
        {
            if(cur_leader<arr[i])
            {
                cur_leader=arr[i];
                System.out.print(cur_leader+" ");
            }
        }
    }
    
}
