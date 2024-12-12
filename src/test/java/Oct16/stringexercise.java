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
        String str7="immutable";
        //           able .concat immut I
        str7=str7.substring(5).concat(str7.substring(0,5)).replace('i','l');
        System.out.println(str7);

        //Eigth program
        String str8="abababa";
        int count8=str8.length()-str.replaceAll("aba", "").length();
        System.out.println(count8);

        //Ninth program
        String str9="abcdefgh";
        str9=str9.substring(2,6).concat(str9.substring(6)).replace("e","X").replace("c","Y");
        System.out.println(str9);

        //Tenth program
        String str10="lorem ipsum dolor sit amet,consectetur adipiscing elit.".repeat(5);
        System.out.println(str10);

        //11th program
        String str11="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomindex=(int)(Math.random()*str11.length());
        System.out.println(str11.charAt(randomindex));

        //12th program
        /*String str12="hello world,";
        String str12a="World! welcome to java programming.";
        System.out.println(combined.CharAT(13));*/

        //13th program
        String str13a="java";
        String str13b=null;
        String result=String.join("-",str13a,str13b);
        System.out.println(result);

        //14th program
        //Index 334 out of bounds for length 38---error occurs
       /* String str14="Very Long string loaded from a file...";
        System.out.println(str14.charAt(334));*/

        //15 th program
        String str15="Hello\nworld\tJava";
        System.out.println(str15.charAt(12));

        //16th program
        String str16a="hello world";
        String str16b="hello world";
        System.out.println(str16a.equals(str16b));
        System.out.println(str16a==str16b);

        //17th program
        String str17="hello";
        String str17b=str17;
        str17="world";
        System.out.println(str17b);

        //18th program
        String str18="abcdef";
        str18=str18.replace('a','A').substring(1,4);
        System.out.println(str18);


        //
    }
}
