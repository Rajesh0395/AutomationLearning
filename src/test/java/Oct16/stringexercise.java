package Oct16;

import java.sql.SQLOutput;

public class stringexercise {

    public static void main(String [] args) {
        //First program
        String s="abcde".repeat(100);
        //System.out.println(s);
        System.out.println(s.charAt(12));
        //Second program
        String Str="Counting Character is a String.";
        System.out.println("Character at index 10:"+Str.charAt(10));

        //Third program
        String Str1="hello world";
        String Str2=Str1.substring(5);
        System.out.println(Str2);
        String Str3="world";
        // world==world
        System.out.println(Str2==Str3);
       System.out.println(Str2.equals(Str3));

       //Fourth program
        String str="concatenate";
        //0=c ,0=1,n=2,c=3,a=4,t=5,e=6,n=7,a=8,t=9,e=10
        //if substring used it will include the first value and last value will be excluded
        str=str.substring(3,8).concat(str.substring(1,4).concat(str.substring(0,2)));
        System.out.println(str);

        //Fifth program
        //indexof will print the first character from index
        String str5="hello java";
        int index=str5.indexOf("java")-1;
       // System.out.println(index-1);
        System.out.println(str5.substring(index));

        //Sixth program
        String str6=" Welcome ";
        System.out.println(str6.substring(0,0).isEmpty());
        System.out.println(str6.substring(1,1).isBlank());

        //Seventh program



        //
    }
}
