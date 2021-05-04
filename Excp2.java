public class Excp2 {
  public static void main(String[]args)  
  {
      try{
          int a=200,b=0,c;
c=a/b;

      }
      catch (NullPointerException e)
      {
          System.out.println(e);
      }
      finally
      {
          System.out.println("Iam always execute");
      }
  }
}
