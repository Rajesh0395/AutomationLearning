package Oct15;

public class Variable {


    public static void main(String[] args) {
        //variable is temporary storage of values
        //rules followed to declare a variable
        // 1.It should start with small letter
        //2.It should not start with a number or a special character
        //3.It should not have any white spaces between variables
        //4.It should not have any java keyword as variable (57 java keywords are there)

        int a;
        byte b;
        short c;
        float d;
        double e;
        char f;
        boolean h;
        long i;

        a = 123;
        b = 2;
        c = -23;
        d = 2.344f;//f indicates float
        e = 223344454.3333d;
        f = 'A';
        h = true;
        i = 2343333333333L;//L indicates long

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);
        System.out.println(i);

        //
        System.out.println("answer is :"+(f-d*e));
        //System.out.println(h-a);
        //a1+g7-e5/b2
        //-324+123.456 -1234/A
        //-324+123.456 -1234/65
        //-324+123.456 -18.98461538461538
        //-200.544-18.98461538461538
        //-219.5286153846154

        //From java 10 onwards we have a new variable called var
        //var is a local variable we can store any type of data without considering datatype

        var abc=2343333;
        System.out.println(abc);

        //From java14 onwards we have a concept as multi line strings
        //same variable name can be used to store different values
        //it will print the latest values
        String s= """
                hello
                today is a holiday
                """;
        s="hello";
        System.out.println(s);
        String ZZ="2223";
        System.out.println(ZZ);




    }
}
