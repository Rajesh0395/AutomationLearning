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
        int aaa=6;
        int bbb=3;
        int ccc=2;
        //                 6+3*2-3
        //                  6+6-3
        //                 12-3
        //                  9
        System.out.println(aaa+bbb*ccc-aaa/ccc);

        //sixth problem
        int total=100;
        int discount =20;
        //                  100-10
        //90
        System.out.println(total-discount/2);

        //seventh problem
        int xxx=10;
        int yyy=5;
         //               ((10-5)*(15)
        //                (5)*15
        //75
        System.out.println((xxx-yyy)*(xxx+yyy));


        //Eight problem
        int a=5;
        int b=3;
        int c=3;
        //we do not consider decimal
        //              (5*3+3-1)
        //              (15+3-1)
        //               18-1
        //17
        System.out.println(a*b+c-a/b);
// 9th problem
        int d=15;
        int e=5;
                         //(15/5*5(8)
        //               15/5*40
        //3*40
        //120
        //  15/5*(5+3)
        //    5*8

        // correct solution
        //             (15/5*(8)
        //               3*8
        //24
        System.out.println(d/e*(e+3));

        //10th problem

        int f=8;
        int g=4;
        int h=2;
        //System.out.println(a/b+c*(b-c));
        System.out.println(f/g+h*(g-h));
        //                8/4+2*2
        //                2+4
        //6
// 11th problem

        int i=20;
        int j=4;
        System.out.println(i-j*3+(j*2));
                          //20-4*3+8
        //                  20-12+8
        //                  28-12
                               //16
        //12th problem

        int x=4;
        int y=6;
        int z=2;
        System.out.println(x+y*z-x*z);
         //               4+12-8
        //                 16-8 //8

        //13th problem
        double ax =5.0;
        double bx=2.0;
        System.out.println (ax*bx+(ax-bx)/bx);
        //                 (5.0*2.0+3.0/2.0
       //                   5.0*2.0+1.5
       //11.5

       //14th problem

       int u=3;
       int v=9;
       System.out.println(u*(v/u)+v%u);
                           //3*3+0
       //                    9+0=9

       //15th problem

        int k=9;
        int l=2;
       System.out.println(k*(l+1)-l);
       //                 9* 3-2
                       //   27-2= 25


}
}