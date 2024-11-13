package Nov4;

import java.util.Arrays;

public class ArrayExercise {

    public static void main (String[] args)
    {
        int[] arr1={1,2,3,4};
        /// arr2=arr1
        //1,2,3,4=1,2,3,4
      //  int[] arr2=arr1;
        // arr2[2]--index position 2 =10
        //so now arr2 value is {1,2,10,4}
        //arr2[2]=10;
        //arr2=arr1 so it will print 1,2,10,4
        System.out.println(Arrays.toString(arr1));

        //Second Exercise Program
      /*  int [] arr={1,2,3,4};
        {
            //1=1*2=2
            //  2=2*2=4
            //3=3*2=6
            //4=4*2=8

            for (int val:arr)
            {
                val=val*2;
               // System.out.println(val);
                System.out.println(Arrays.toString(arr));
            }
        }*/
        //third exercise program
        int []arr={1,2,3,4,5,6};
        {
        //for (int i=0;j=arr.length-1;i<j;i+=2;j-=2)
            {
              //  int temp=arr[i];
              //  arr[i]=arr[j];
              //  arr[j]=temp;
                System.out.println(Arrays.toString(arr));

            }
        }
    }
}
