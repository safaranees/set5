import java.io.*;
import java.util.*;
class Ktimes
{
  public static void main(String args[])
  {
    Scanner str=new Scanner(System.in);
    String str1=str.next();
    System.out.println("enter the number of times to be printed");
    int k=str.nextInt();
    for(int i=0;i<k;i++)
    {
      System.out.println(str1);
    }
  }
}
