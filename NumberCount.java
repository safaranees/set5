import java.util.Scanner;
public class NumberCount
{
    public static void main(String args[])
    {
      
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        while(num>0)
        {
            count=count+1;
            num=num/10;
        }
      
       
       
        System.out.println(count);
    }
}
