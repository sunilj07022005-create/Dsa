/*Write a Java program to input n integers into an array and:
Print all elements
Find sum and average
Find maximum and minimum
Count even and odd numbers
Reverse the array */


public class J6_Dsa_multiquestion {
    public static  void main(String [] arg)
    {
        int arr []= {12,43,76,34,98,87,34,65,18};

        //1
        for(int a : arr)
        {
            System.out.println(a);
        }

        //2
        int sum=0;
        int size = arr.length;
        System.out.println("size of arr : "+size);
        for(int a=0; a<size; a++)
        {
            sum += arr[a];
        }
        System.out.println("sum : "+sum);
        int avg = 0;
        avg = sum/size;
        System.out.println("avg : "+ avg);

        //3
        int max= arr[0];
        int min= arr[0];
        for(int p=0 ; p<size; p++)
        {
            if(arr[p]>max)
            {
                max = arr[p];
            }
        }
        for(int p=0; p< size; p++)
        {
            if(arr[p]< min)
            {
                min = arr[p];
            }
        }
        System.out.println("minimum: "+min);
        System.out.println("maximum"+max);


        //4
        int even = 0, odd=0;
        for(int a=0; a<size; a++)
        {
           if(arr[a]%2==0)
           {
                even++;
           }
           else{
                odd++;
           }
        }
        System.out.println("even no : "+even);
        System.out.println("odd no: "+odd);

        //5
        for(int a=0; a<arr.length/2; a++)
        {
            int temp = arr[size-1-a];
            arr[size-1-a] = arr[a];
            arr[a]= temp;
        }
        for(int num : arr)
        {
            System.out.println(num);
        }
    }
}
