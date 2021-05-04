public class Excep {
    public static void main(String[]args)
    {
  try {
int a =100,b=0;
int c=a/b;
System.out.println(c);
    }
catch(ArithmeticException e) //The "catch" block is used to handle the exception
{
    System.out.println(e);
    System.out.println("Hey number can't divide by zero");

}
}
}
