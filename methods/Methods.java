//2 static,instance methods and variables
/*
class Methods
{
    static int a=10;
    static int b=20;
    int c=30;
    int d=40;
    static void s1()
    {
        System.out.println("static method 1");
    }
    static void s2()
    {
         System.out.println("static method 2");
         System.out.println(a);
      System.out.println(b);
    }
     
      void instancemethod1()
      {
          System.out.println("instance method1");
      }
      void instancemethod2()
      {
          System.out.println("instance method2 ");
      }
      public static void main(String[] args){
          Methods a=new Methods();
          a.s1();
          a.s2();
          
          System.out.println("executed successfully");
      }
}
*/

//print instance variables in static method
/*
class Methods
{
    int a=10;
    int b=20;
    static void a()
    {
        Methods obj=new Methods();
        System.out.println(obj.a);
        System.out.println(obj.b);
        
    }
    public static void main(String[] args)
    {
        System.out.println("executed succesfully");
        a();
    }
}
*/

//print static variables in instance method
/*
class Methods
{
    static int a=10;
    static int b=20;
    {
        System.out.println("Instance block");
    }
    public static void main(String[] args)
    {
        System.out.println("Instance method");
        System.out.println(a);
        System.out.println(b);
    }
}
*/

//call instance method in static method
/*
class Methods
{
    static{
        System.out.println("static block");
    }
    void a()
    {
        System.out.println("Instance method");
    }
    public static void main(String[] args)
    {
        System.out.println("Static method");
        Method m=new Method();
        m.a();
    }
}
*/

//call static method in instance method
/*
class Methods
{
    static{
        System.out.println("static block");
    }
    void a()
    {
        System.out.println("Instance method");
    }
    public static void main(String[] args)
    {
        System.out.println("Static method");
        Method m=new Method();
        m.a();
    }
}
*/


//call all instance ans static variables in main fun
/*
class Methods
{
    int a=10;
    int b=20;
    static int c=30;
    static int d=40;
    public static void main(String[] args)
    {
        Method m=new Method();
        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(c);
        System.out.println(d);
    }
}
*/

//call static and instance methods in main method
/*
class Methods
{
    void a()
    {
        System.out.println("Instance method");    
    }
    static void b()
    {
        System.out.println("Static method");
    }
    public static void main(String[] args)
    {
        Method m=new Method();
        m.a();
        b();
    }
}
*/