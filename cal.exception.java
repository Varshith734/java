//exception handling
import java.util.Scanner;
class cal_exception
{
  int a,b;
  static float div(int a,int b)
 {
   float result=a/b;
  return result;
}

 public static void main(String[] args)
 {
   Scanner s=new Scanner(System.in);
   System.out.println("enter the  a value :");
   int a=s.nextInt();
   System.out.println("enter the  b value :");
   int b=s.nextInt();
   float res=div(a,b);
   System.out.println("the divi value is");
}
}
   
   