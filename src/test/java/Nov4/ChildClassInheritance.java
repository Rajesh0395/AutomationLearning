package Nov4;

public class ChildClassInheritance extends ParentClassInheritance {

 private int b=20;
    public static void main(String [] args) {
        ChildClassInheritance c1 = new ChildClassInheritance();
        c1.rectangle();
        c1.circle();
    }
    //method overriding -->runtime polymorphism
    //when two methods having same set
    // in parent and child class
    //if we use the same method name in parent and child class it will override the parent class
    //print only the child class ..if we want to print both method we need to use super keyword
    //super keyword will print the method ,objects,varialbes present in the parent class
    public void rectangle()
        {
            super.rectangle();
            System.out.println("this is a child class rectangle");
            System.out.println(super.a);
            System.out.println(b);
        }

    }

