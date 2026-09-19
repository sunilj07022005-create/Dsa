// finding the seconde largest

public class J2_Dsa_secondelargestwithoutsort 
{
    public  static  void main(String arg [])
    {
        int arr[] = {23,4,64,34,74,85,74,8};
        int largest = arr[0];
        int seclargest = arr[1];
        // int size = arr.length;
        for(int a=0; a<arr.length; a++)
        {
            if(arr[a] > largest)
            {
                seclargest = largest;
                largest = arr[a];
            }
            else if(arr[a] >seclargest ){
                seclargest = arr[a];
            }
        }
        System.out.println(largest);
        System.out.println(seclargest);
    }

    // public static  void main(String arg [])
    // {
    //     int arr[] = {23,4,64,34,74,85,74,8};

    //     int smallest = arr[0];
    //     int secsmallest = arr[1];
    //     if (secsmallest < smallest ) {
    //         int temp = smallest;
    //         smallest = secsmallest;
    //         secsmallest = temp;
    //     }
    //     for(int a=2; a<arr.length; a++)
    //     {
    //         if(arr[a]<smallest)
    //         {
    //             secsmallest = smallest;
    //             smallest = arr[a];
    //         }
    //         else if (arr[a] < secsmallest)   // if two small same value are present and you want to allow then uswe the <= operater 
    //         {
    //             secsmallest = arr[a];
    //         }
    //     }
    //     System.out.println("smallest : "+smallest);
    //     System.out.println("secsmallest : "+secsmallest);
    // }
}