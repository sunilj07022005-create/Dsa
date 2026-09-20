class J3_Dsa_reveresarraywithoutusingotherarray
{
    public static void main(String [] args)
    {
        int arr[] = {34,45,75,86,6,9,35,0,8,3};
        
        int size = arr.length;
        for(int a=0; a<arr.length/2; a++)
        {
            int temp = arr[a];
            arr[a]= arr[size-1-a];
            arr[size-1-a]= temp;
        }
        for(int a : arr)
        {
            System.out.println(a);
        }
    }
}