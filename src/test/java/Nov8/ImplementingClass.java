package Nov8;

import java.util.Arrays;

public class ImplementingClass implements SampleInterface{


    public static void main(String[] args)
    {
        ImplementingClass i1=new ImplementingClass();
        i1.display();
        System.out.println(i1.sum(10,20));
       // System.out.println(Arrays.(i1.toString()));
        i1.makepayment();
        i1.payment();
        //System.out.println(i1.sum(a:10, b:20));

    }

    @Override
    public void display() {

    }

    @Override
    public SampleInterface payment() {
        return null;
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public double sum(double a, double b) {
        return a+b;
    }

    @Override
    public String name(String rajesh) {
        return "rajesh";
    }

    //@Override
        public void makepayment()
        {
            System.out.println("payment is successful");
        }



}
