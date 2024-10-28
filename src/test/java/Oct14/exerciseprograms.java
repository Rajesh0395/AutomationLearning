package Oct14;

public class exerciseprograms {

    public static void main (String[] args)
    {
        //first question
        int aa=10;
        int bb=20;
        //   bodmas         10+20*2
        //                  10+40
        //50
        System.out.println(aa+bb*2);
//second question
     int xx=8;
     int yy=3;
     //first do the operations of inside brackets
      //  8+3*2=11*2=22
        System.out.println((xx+yy)*2);

//third question
        int p=12;
        int q=4;
                      //(12-4+12)
                      //(24-4)
                       //20
        System.out.println(p-q+q*3);

        //fourth question

        double m=7.5;
        double n=2.5;
        //first division (7.5/2.5+2.5)
        //               (3+2.5)
        //5.5
        System.out.println(m/n+n);

        //fifth problem
        int a=6;
        int b=3;
        int c=2;
        //                 6+3*2-3
        //                  6+6-3
        //                 12-3
        //                  9
        System.out.println(a+b*c-a/c);

        //sixth problem
        int total=100;
        int discount =20;
        //                  100-10
        //90
        System.out.println(total-discount/2);

        //seventh problem
        int x=10;
        int y=5;
         //               ((10-5)*(15)
        //                (5)*15
        //75
        System.out.println((x-y)*(x+y));
    }
}
