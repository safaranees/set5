import java.io.*;
import java.util.*;
class Average
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int sum=0;
  
    int[] arr=new int[10];
    for(int i=1;i<=num;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int i=1;i<=num;i++)
    {
      sum=sum+arr[i];
    }
   
     int Average=sum/num;
    System.out.println(average);
  }
}
