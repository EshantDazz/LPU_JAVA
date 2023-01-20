public class Frequencies_in_SortedArray {
    static public void main(String args[])
    {
        int arr[]={10,10,10,25,30,30};
        int n=arr.length,c=0;
        for(int i=0;i<n-1;i++)
        {
             if(arr[i]==arr[i+1])
             c++;
             else
             {
                System.out.print(arr[i-1]+" "+c+1+" ");
                c=0;
             }
        }
    }
    
}
