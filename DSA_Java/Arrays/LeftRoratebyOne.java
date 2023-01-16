public class LeftRoratebyOne {
    static public void main(String args[])
    {
        int arr[]={224,56,78,89,100};
        int t=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=t;
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+ "  ");

    }
    
}
