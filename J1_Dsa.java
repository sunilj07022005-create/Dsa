// Find the Missing Element

// import java.util.Scanner;

public class J1_Dsa {
  public static int Missing_num(int [] arr)
    {
        int size = arr.length;
        int expected = size * (size+1) / 2;
        int actual = 0;
        for(int a=0; a<size; a++)
        {
            actual +=arr[a];
        }
        return  expected - actual;
    }
    public static void main(String [] arg)
    {
        int arr[] = {3,0,1};
        System.out.println(Missing_num(arr));  
    }
}
