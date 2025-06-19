/* single star
public class Patterns
{
public static void main(String[]args)
{
System.out.println("*");
}
}*/


/*vertical stars
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
System.out.println("*");
}
}
}*/


/*Horizontal stars
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
System.out.print("*");
}
}
}*/

//Basic square pattern
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}

/*square number patterns
public class Patterns
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(i);
}
System.out.println("");
}
}
}*/

/*square numbers in horizontal way
public class Patterns
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j);
}
System.out.println("");
}
}
}*/

/*square continous number pattern
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }
    }
}*/


/* square patterns with 1 to 9 numbers
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number++;
                if(number>9)
                {
                    number=1;
                }
            }
            System.out.println();

        }
    }
}*/

/* square patterns with incrementing number by 2
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number+=2;
            }
            System.out.println();

        }
    }
}*/

/*number pattern in square formate 
public class Patterns
{
    public static void main(String[]args)
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=3;j++)
            {
                System.out.print(j%2 +"\t");
            }
            System.out.println("");
        }
    }
}*/


/*Triangle
class Patterns
{
    public static void main(String[]args)
    {
    
    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}*/


/*Multiples of 2
class Patterns
{
    public static void main(String[]args)
    {
    
    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k*2+" ");
                
            }
            System.out.println();
        }
    }
}*/


/*Triangle
class Patterns
{
    public static void main(String[]args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}*/


/*Hallow square
    public class Pattern
{
    public static void main(String[] args)
    {
        int size = 5;

        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
            {
                if (i == 1 || i == size || j == 1 || j == size)
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/


/*Plus symbol * patterns
    public class Pattern
{
    public static void main(String[] args)
    {
        int n = 5;

        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
               
                if (i == mid || j == mid)
                {
                    System.out.print("* ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

/* Cross symbol start patterns
    public class Pattern {
    public static void main(String[] args)
    {
        int n = 5;

        for (int i = 1; i <= n; i++)
        {        
            for (int j = 1; j <= n; j++)
            {      
               
                if (i == j || i + j == n + 1)
                {
                    System.out.print("* ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

/*Rhombus
    public class Pattern {
    public static void main(String[] args)
    {
        int rows = 4;
        for (int i = 1; i <= rows; i++)
        {

            for (int j = 1; j <= rows - i; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--)
        {
            for (int j = 1; j <= rows - i; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
*/
