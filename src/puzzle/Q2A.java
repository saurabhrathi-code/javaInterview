package puzzle;

public class Q2A {
        public void m1() throws ArrayIndexOutOfBoundsException{
            System.out.println("In m1 A");
        }
    }

    class B extends Q2A {
    public void m1() throws IndexOutOfBoundsException
    {
        System.out.println("In m1 B");
    }
    void m2() throws IndexOutOfBoundsException
    {
        System.out.println("In m2 B");
    }
}
    class Test {
        public static void main(String[] args) {
            Q2A a=new B();
          //  a.m2(); issue
            a.m1();
        }
    }
