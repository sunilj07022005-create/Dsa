public class J5_Dsa_removeddup {
    public static  void main(String [] arg)
    {
        int arr[] = {34,4,24,4,0,89,0,34,76,12,0};
        int index =0;

        for(int a=0; a<arr.length; a++)
        {
            boolean duplicate = false;
            for(int i=0; i<index; i++)
            {
                if(arr[a] == arr[i])
                {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)
            {
                arr[index] = arr[a];
                index++;
            }
        }
        for(int a=0; a<index; a++)
        {
            System.out.println(arr[a]+" ");
        }
    }
}