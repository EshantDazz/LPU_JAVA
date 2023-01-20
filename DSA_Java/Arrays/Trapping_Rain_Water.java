public class Trapping_Rain_Water {
    static public void main(String args[])
    {
          int arr[]={5,0,6,2,3};
          int res=0;
          int n=arr.length;
          int lmax[]=new int[n];
          int rmax[]=new int[n];

          lmax[0]=arr[0];
          rmax[n-1]=arr[n-1];
          for(int i=1;i<n;i++)
          lmax[i]=Math.max(lmax[i-1],arr[i]);
          for(int i=n-2;i>=0;i--)
          rmax[i]=Math.max(rmax[i+1],arr[i]);

          for(int i=1;i<n-1;i++)
          res+=Math.min(lmax[i],rmax[i])-arr[i];

          System.out.println(res);


    }
    
}
