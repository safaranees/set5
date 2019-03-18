import java.io.*;
import java.util.*;
class Inclusive
{
  public static void main(String args[])
  {
    Scanner num=new Scanner(System.in);
    int num1=num.nextInt();
    if(num1>=1 && num1<=10)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }
  }
}
