package Oct14;

public class Sample {
// package name should be start with small
    // class name should be start with caps
    //class name should not have any numeric

    public static void main(String[] args) {
       // system.out.println("hello world");
        System.out.println("hello world");
        System.out.println(40-200+100);
        System.out.println(30*200-30/3+20);
        //30*200-30/3+20
        //division multiplication addtion subraction
        //we need to follow bodmas theory
        //30*200-10+20
        //6000-10+20
        //6000-10
        //6010

        System.out.println(500/10*10+300/300*10-200);
        //500/10*10+300/300*10-200
        //50*10+1*10-200
        //500+10-200
        //510-200
        //310

        // + is used to join the values
        //400-300-1000
        //400-1300
        //-900
        System.out.println("number generated is : "+(400-300-100*10));

        System.out.println(500/10*10+300/300*10-200);
        //50*10+1*10-200
        //500+10-200
        //510-200
        //310
         //if we need to add to values we need to give it in inside paranthesis
        //otherwise it will be consider concateneted operater
        //below one is example for concatenate operator
        System.out.println("the value of x is :" + 1+2);
        //below statement is example for addition operator
        System.out.println("the value of x is :"+(1+2));
        System.out.println("the value of x is :"+(1-2));
        System.out.println("the value of x is :"+(1*2));
        System.out.println("the value of x is :"+ (4/2));

        //modulo is reminder value in division
        System.out.println("the value of modulo is :"+(5%2));

    }

}