//Different ways to declare a strings
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s2="Roshi";
        String s3=new String("Roshi");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
*/


//Concatination of 2 strings
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s2="Roshi";
        String s3=new String("Juhi");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1=s1+s3;
        System.out.println(s1);
    }
}
*/

//Length of a strings
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s2="Roshi";
        String s3=new String("Juhi");
        System.out.println(s1.length());
        System.out.println(s2);
        System.out.println(s3.length());
    }
}
*/


//Substring of astrings
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s3=new String("Juhi");
        s1=s1+s3;
        System.out.println(s1);
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0,5));
    }
}
*/


//indexof a string
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s3=new String("Juhi");
        s1=s1+s3;
        System.out.println(s1);
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf('h'));
        System.out.println(s1.lastIndexOf('i'));
    }
}
*/


//comparision of  a string
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s2=new String("Roshi");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
*/


//startswith,endswith,compareTo,eualsIgnoreCase of  a string
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s2=new String("Roshi");
        System.out.println(s1.startsWith("Ros"));
        System.out.println(s1.endsWith("i"));
        System.out.println(s2.compareTo(s1));
        String s3=new String("Juhi");
        System.out.println(s1.compareTo(s3));
        String s4="roshi";
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
*/


//trim of  a string
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        String s2="   Juhi";
        System.out.println(s1.trim());
        System.out.println(s2.trim());
    }
}
*/


//Replacing a string
/*
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshi";
        System.out.println("Original string: "+s1);
        String s2=s1.replace("Roshi","Roshitha");
        System.out.println("Replaced string: "+s2);
    }
}
*/


//Converting no in to  a string
/*
class Strings
{
    public static void main(String[] args)
    {
        int a=123;
        String s1=String.valueOf(a);
        System.out.println(s1);
        System.out.println(s1.length());
    }
}
*/


//String into lower and upper cases
/*
//String into lower and upper cases
class Strings
{
    public static void main(String[] args)
    {
        String s1="ROSHI";
        String s2="juhi";
        System.out.println("First string: "+s1);
        System.out.println("Second string :"+s2);
        System.out.println("First string into lowercase: "+s1.toLowerCase());
        System.out.println("Second string into uppercase: "+s2.toUpperCase());
    }
}

*/


//Coverting integer object into a string
/*
class Strings
{
    public static void main(String[] args)
    {
      int a=10;
      String s1=String.valueOf(a);
      System.out.println(s1);
      String s2=Integer.toString(a);
      System.out.println(s2);
    }
}
*/


//Splitting a string
/*
import java.util.Arrays;
class Strings
{
    public static void main(String[] args)
    {
        String s1="Roshijuhi";
        String[] s2=s1.split("i");
        System.out.println(Arrays.toString(s2));
    }
}
*/


//Matching a string in RE
/*
class Strings
{
    public static void main(String[] args)
    {
      String reg="[a-zA-Z]+\\d+";
      String a="java123";
      System.out.println(a.matches(reg));
    }
}
*/
