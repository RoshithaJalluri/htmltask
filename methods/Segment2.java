 class Segment1
{
    static int a = 10;
    static int b = 20;
    int c = 30;
    int d = 40;
    static 
    {
        System.out.println("Static1");
    }
    static 
    {
        System.out.println("Static2");
    }
    {
        System.out.println("Instance1");
    }
    {
        System.out.println("Instance2");
    }
    static void m1() 
    {
        System.out.println(a);
    }
    static void m2() 
    {
        System.out.println(b);
    }
    void p1()
    {
        System.out.println("HI");
    }
    void p2() 
    {
        System.out.println("HELLO");
    }
}
    public class Segment2
    {
        static int e = 10;
        static int f = 20;
        int g = 30;
        int h = 40;
        static 
        {
            System.out.println("Static3");
        }
        static 
        {
            System.out.println("Static4");
        }
        {
            System.out.println("Instance3");
        }
        {
            System.out.println("Instance4");
        }
        static void m3() 
        {
            System.out.println(e);
        }
        static void m4() 
        {
            System.out.println(f);
        }
        void p3() 
        {
            System.out.println("HYD");
        }
        void p4() 
        {
            System.out.println("AP");
        }
        public static void main(String[] args)
        {
            Segment1 s1 = new Segment1();
            s1.p1();
            s1.p2();
            s1.m1();

            Segment2 s2 = new Segment2();
            s2.p3();
            s2.p4();
            m3();
            m4();
        }
    
}
