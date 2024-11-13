package Nov4;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.columns;
import static jdk.internal.org.jline.utils.InfoCmp.Capability.cursor_up;

public class ContinuationofArrays {


    public static <dataType> void main(String [] args)
    {
       String [] a2=new String[5];
        a2[0]="hello";
        a2[1]="world";
        a2[2]="java";
        a2[3]="programmer";
        a2[4]="selenium";

        //print the array in string format
        System.out.println(a2);
        System.out.println(Arrays.toString(a2));

        //sort the array in descending order
        //this is used for non primitive data types
        Arrays.sort(a2, Collections.reverseOrder());
        System.out.println(Arrays.toString(a2));

        //copy of array from one to other
      //  String a3 []=Arrays.copyOfRange(a2, newLength:10);

        //2D array

        //Array of Arrays
            //Array which represents data in the form or rows and columns
        //syntax to declar 2D array
        //dataType[][] arrayName=new dataType[rows][columns];
       //which represents 3 rows and 3 columns
        int [][] arr=new int[3][3];
        System.out.println(Arrays.deepToString(arr));

        //Refer to the 1st row and 2nd Cell
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
       //
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=i*j;
            }
        }

        System.out.println(Arrays.deepToString(arr));

        //Arrays.copyOf(arr, newLength:4);
               //this is example of yutoube program
            int[] b=new int[5];
            b[0]=1;
            b[1]=2;
            b[2]=3;
            b[3]=4;
            b[4]=5;
       //for each loop
      /*      for(int x:b)
       {
           System.out.println(x);
       }*/

            //for loop
        for (int i=0;i<=b.length-1;i++) // if we are using <= we have to use length-1 then only it wil print
            //0 to 4 exact value //otherwise we can use i<b //2.i<=b.length-1
        {
            System.out.println(i);
        }

         //length of an array

        System.out.println(b.length);

        //printing particulary characterin array
        System.out.println(b[2]);
    }
}
