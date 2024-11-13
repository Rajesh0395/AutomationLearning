package Oct16;

public class stringexercise {

    public static void main(String [] args)
    {
        String str="abcde".repeat(100);
        //System.out.println(str);
        System.out.println(str.charAt(450));

        String str1="Counting characters in a string";
        System.out.println("character at index 10:"+str1.charAt(10));
        //excepting output c

        String str2="Lorem ipsum dolor sit amet, consectetur adipiscing elit.".repeat(5);
       // System.out.println(str2);
        System.out.println(str2.charAt(120));

        String str3="ABCDEFGHJIKLMNOPQRSTUVWXYZ";
        int randomIndex=(int)(Math.random()*str3.length());
        //System.out.println(str3.charAt(randomIndex));
    }
}
