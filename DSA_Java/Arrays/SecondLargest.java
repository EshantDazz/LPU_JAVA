public class SecondLargest {
    static public void main(String args[])
    {
        // For Naive Approach First find Largest and then go for the Second Largest 
         int r=-1,largest=0;
         int arr[]={34,767,98,242,798,12};
         for(int i=1;i<arr.length;i++)
         {
            if(arr[i]>arr[largest])
            {
                r=largest;
                largest=i;
    
            }
            else if(arr[i]!=arr[largest])
            {
                if(r==-1 || arr[i]>arr[r])
                r=i;
            }
         }
         
    }
    
}
