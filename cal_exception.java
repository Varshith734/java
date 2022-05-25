//exception handling
import java.util.Scanner;
class cal_exception
{

  static void div()
 {
	int a=10;
	int b=0;
try
{
   int result=a/b;
  System.out.println(result);
System.out.println("programe ended..");
}
/*catch(ArithmeticException e)
{
System.out.println(" arithmatic not divided..");
}*/
catch(Exception e)
{
System.out.println("not divided.......!");
}
}

 public static void main(String[] args)
 {
   /*Scanner s=new Scanner(System.in);
   System.out.println("enter the  a value :");
   int a=s.nextInt();
   System.out.println("enter the  b value :");
   int b=s.nextInt();*/
	div();
  // System.out.println("the divi value is :"+res);
}
}
   
   