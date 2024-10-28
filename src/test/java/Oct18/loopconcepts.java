package Oct18;

import java.util.Scanner;

public class loopconcepts {

   /* public static void main(String[] args) {
        int a = 12;
        while (a < 20) {
            if (a % 2 == 0) {
                System.out.println("the value of a is:" + a);
                break;
            }
        }
    }*/
public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
         int n=   sc.nextInt();
            while(n<1 || n>10)
            {
                System.out.println("n+ number not between 1 and 10 try again ");
            }
}

}





