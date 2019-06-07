import java.util.*;
import java.io.*;
public class LargestSmallest
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int a[]=new int[10];
        for(int i=0;i<num;i++)
        {
            a[i]=s.nextInt();
        }
        int maximum=a[0];
        int minimum=a[0];
        for(int i=0;i<num;i++)
        {
            if(a[i]>maximum)
            {
                maximum=a[i];
            }
        }
         for(int i=0;i<num;i++)
        {
            if(a[i]<minimum)
            {
                minimum=a[i];
            }
        }
        System.out.println(minimum);
        System.out.println(maximum);
    }
}
