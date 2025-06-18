/*
bright it career
class Loops
{
    public static void main(String[] args)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Bright IT Career");
        }
    }
}*/

/*
numbers line by line
class Loops
{
    public static void main(String[] args)
    {
        int i=1;
        while(i<=20)
        {
            System.out.println(i);
            i++;
        }
    }
}*/

/*
any 2 no.s are equal are not
class Loops
{
    public static void main(String[] args)
    {
        int a=10;
        int b=5;
        int c=5;
        if(a==b)
        {
            System.out.println("a is equal to b");
        }
        if(b==c)
        {
            System.out.println("b is equal to c");
        }
    }
}*/

/*
odd and even no.s upto 20
class Loops
{
    public static void main(String[] args)
    {
        int n=20;
        System.out.println("Odd numbers upto"+n+":");
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+" ");
            }
        }
            System.out.println("Even numbers upto"+n+":");
            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i+" ");
                }
            }
}
}*/

/*
largest no.s among 3 no.s
import java.util.Scanner;
class Loops
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2=scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3=scanner.nextInt();
        int largest;
        if(num1>=num2&&num1>=num3){
        largest=num1;
    }
    else if(num2>=num1&&num2>=num3){
    largest=num2;
}
else
{
largest=num3;
}
System.out.println("The Largest number is:"+largest);
}
}*/

/*
no.s 1-10 using do while loop
class Loops
{
    public static void main(String[] args)
    {
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}*/

/*
even no.s b/w 10-100
class Loops
{
    public static void main(String[] args)
    {
        int n=10;
        System.out.println("Even numbers between 10 and 100:");
        while(n<=100)
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
            n++;
        }
    }
}*/

/*
armstrong no
import java.util.Scanner;
class Loops
{
    public static void main(String[] args)
    {
        int n,i,rem,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=s.nextInt();
        i=n;
        while(n>0)  
        {
            rem=n % 10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if(i==sum)
        {
            System.out.println(i+" is a armstrong number");
        }
        else
        {
            System.out.println(i+" is not a armstrong number");
        }
   }
}*/

/*
prime no

class Loops
{
    public static void main(String[] args)
    {
        int num=89;
        System.out.println("The given number is:"+num);
        int count=0;
        if(num==2)
        {
            System.out.println(num+ "is a prime number");
        }
        else
        {
            for(int i=1;i<=num;i++)
            {
            if(num%i==0)
            {
                count++;
            }
            }
            if(count==2)
            {
                System.out.println(num+"is a prime number");
            }
            else
            {
                System.out.println(num+"is not a prime number");
            }
        }
    }
} */

/*
even or odd no
import java.util.Scanner;
class Loops
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number=s.nextInt();
        int remainder=number%2;
        switch(remainder)
        {
            case 0:
                System.out.println(number+ "is an even number");
                break;
            case-1:
                System.out.println(number+ "is an odd number");
                break;
                default:
                System.out.println("Invalid input or unexpected remainder");
        }
            s.close();
}
}*/

/*
male or female
Scanner s=new Scanner(System.in);
System.out.println("Enter gender(M/F):");
char genderChar=s.next().charAt(0);
switch(genderChar){
case 'M':
case 'm':
System.out.println("Male");
break;
case 'F':
case 'f':
System.out.println("Female");
break;
default:
System.out.println("Invalid input.Please enter M or F:");
break;
}
s.close();
}
}*/