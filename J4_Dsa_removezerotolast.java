public class J4_Dsa_removezerotolast {
    public static void main(String [] arg)
    {
        int arr[]= {34,4,24,76,0,89,0,34,76,12,0};
        
        int index = 0;

        for(int a=0; a< arr.length; a++)
        {
            if(arr[a]!=0)
            {
                arr[index]= arr[a];
                index++;
            }
        }
        while(index <arr.length){
            arr[index]=0;
            index++;

        }

        for(int a=0 ; a<arr.length; a++)
        {
            System.out.println(arr[a]);
        }
    }
}
