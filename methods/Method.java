/*
without return and parameters
class Method
{
public void add()
{
System.out.println(10+20);
}
public static void main(String[] args)
{
Method m=new Method();
m.add();
}
}*/

//with parameters and without return
/*
class Method 
{
 public void sub(int a, int b) 
{
 System.out.println(a - b);
}
public static void main(String[] args) 
{
Method m = new Method();
m.sub(10, 5); 
}
}*/

//without parameters and with return
/*
class Method 
{
 public int mul() 
{
System.out.println(10*2);
 return(10*2);
}
public static void main(String[] args) 
{
Method m = new Method();
m.mul(); 
}
}*/

//with parameters and return
class Method 
{
 public int div(int a, int b) 
{
 System.out.println(a / b);
return(a/b);
}
public static void main(String[] args) 
{
Method m = new Method();
m.div(20, 5); 
}
}
