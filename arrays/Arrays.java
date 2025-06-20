//sum of elements in array
/*
class Arrays
{
public static void main(String[] args)
{
int a[]={2,4,6,8,10};
int sum=0;
for(int b:a)
{
sum+=b;
}
System.out.println("The sum of array is " + sum);
}
}*/

//average of elements in array
/*
class Arrays
{
public static void main(String[] args)
{
int a[]={2,4,6,8,10};
int sum=0;
float avg=0;
for(int b:a)
{
sum+=b;
avg=sum/2;
}
System.out.println("The avg of array is " + avg);
}
}*/

//index of an element in array
/*
class Arrays
{
public static void main(String[] args)
{
int a[]={2,3,4,5,6};
int element=5;
for(int i=0;i<a.length;i++)
{
if(a[i]==element)
{
System.out.println(i);
}
}
}
}
*/

// array conatins specific element or  not
/*
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
 int target=4;
int count=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==target)
{
count++;
}

}
if(count==1)
{
System.out.println("element found at position");
}
else
{
System.out.println("element is not found");
}
}
}
*/


//remove element from array
/*
class Arrays
{
public static void main(String[] args)
{
int a[]={2,3,4,5,6};
int element=4;
int b[]=new int[(a.length)-1];
int j=0;
for(int i=0;i<a.length;i++)
{
if(a[i]!=element)
{
b[j]=a[i];
j++;
}
}
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]+"");
}
}
}*/

//copy one array to another array
/*
class Arrays 
{
public static void main(String[] args) 
{
int a[] = {1, 2, 3, 4, 5};
int b[] = new int[a.length - 1];
for (int i = 0; i < b.length; i++) 
{
b[i] = a[i];
}
for (int i = 0; i < b.length; i++)
{
System.out.println(b[i] + "");
}
}
}*/


//adding element to array
/*
import java.util.Scanner;
public class Arrays
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4};
        System.out.println("Old Array:");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nEnter number to add: ");
        int newNumber = sc.nextInt();  
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) 
        {
            b[i] = a[i];
        }
        b[b.length - 1] = newNumber;
        System.out.println("New Array:");
        for (int i = 0; i < b.length; i++) 
        {
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
}
*/

//minmax of an array
/*
public class Arrays
{
    public static void main(String[] args) 
    {
        int a[] = {15, 24, 3, 12, 4};
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) 
        {
            if (a[i] < min) 
            {
                min = a[i];
            }
            if (a[i] > max) 
            {
                max = a[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
*/

//reverse of array
/*
public class ReverseArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Reverse logic
        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
*/

//common elements b/w 2 arrays
/*
public class Arrays 
{
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {3, 4, 5, 6, 7};
        System.out.println("Common elements:");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < b.length; j++) 
            {
                if (a[i] == b[j]) 
                {
                    System.out.println(a[i]);
                    break; 
                }
            }
        }
    }
}
*/

//duplicates in array
/*
class Arrays
{
    public static void main(String[] args)
    {
        int a[]={2,3,4,5,6};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicate is found: "+ a[i]);
                }
            }
        }
        System.out.println("Duplicate not found");
    }
}
*/


//remove duplicates from array
/*
class Arrays
{
    public static void main(String[] args)
    {
        int a[] = {2, 3, 4, 5, 3};
        int b[] = new int[a.length];
        int k = 0;
        for(int i = 0; i < a.length; i++)
        {
            boolean isDuplicate = false;
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                b[k] = a[i];
                k++;
            }
        }
        System.out.println("After removing Duplicate");
        for(int i = 0; i < k; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
*/




