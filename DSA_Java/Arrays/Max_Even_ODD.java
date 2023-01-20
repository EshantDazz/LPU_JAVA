public class Max_Even_ODD {
    static int maxEvenOdd(int arr[])
    {
        int n=arr.length;
        int c=1,r=1;
        for(int i=1;i<n;i++)
        {
            int d1=arr[i]%2;
            int d2=arr[i-1]%2;
            if(((d1==0) && (d2!=0)) || ((d2==0) &&(d1!=0)))
            {
                c++;
                r=Math.max(c,r);
            } 
            else
            c=1;
        }
      return r;

    }
    static public void main(String args[])
    {
        int arr[]={5,10,20,6,3,8};
        int r=maxEvenOdd(arr);
        System.out.println(r);
    }
    
}
